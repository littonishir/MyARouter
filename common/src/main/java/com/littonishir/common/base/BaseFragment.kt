package com.littonishir.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.littonishir.common.app.Mvvm
import com.littonishir.common.event.Message
import com.littonishir.common.utils.showToast
import com.littonishir.common.widget.LoadingDialog
import java.lang.reflect.ParameterizedType

/**
 * Created by kohana on 2021/7/9.
 */
abstract class BaseFragment<VM : BaseViewModel, VB : ViewBinding> : Fragment() {

    protected lateinit var viewModel: VM

    protected lateinit var mBinding: VB

    //是否第一次加载
    private var isFirst: Boolean = true

    private var dialog: LoadingDialog? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initBinding(inflater, container)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onVisible()
        createViewModel()
        lifecycle.addObserver(viewModel)
        //注册 UI事件
        registorDefUIChange()
        initView(savedInstanceState)
    }

    open fun initView(savedInstanceState: Bundle?) {}

    override fun onResume() {
        super.onResume()
        onVisible()
    }

    /**
     * 使用 DataBinding时,要重写此方法返回相应的布局 id
     * 使用ViewBinding时，不用重写此方法
     */
    open fun layoutId(): Int = 0

    /**
     * 是否需要懒加载
     */
    private fun onVisible() {
        if (lifecycle.currentState == Lifecycle.State.STARTED && isFirst) {
            lazyLoadData()
            isFirst = false
        }
    }

    /**
     * 懒加载
     */
    open fun lazyLoadData() {}

    /**
     * 注册 UI 事件
     */
    private fun registorDefUIChange() {
        viewModel.defUI.showDialog.observe(viewLifecycleOwner, {
            showLoading()
        })
        viewModel.defUI.dismissDialog.observe(viewLifecycleOwner, {
            dismissLoading()
        })
        viewModel.defUI.toastEvent.observe(viewLifecycleOwner, {
            showToast(it)
        })
        viewModel.defUI.msgEvent.observe(viewLifecycleOwner, {
            handleEvent(it)
        })
    }

    open fun handleEvent(msg: Message) {}

    /**
     * 打开等待框
     */
    fun showLoading() {

        if (dialog == null) {
            dialog = LoadingDialog(requireContext(), false)
        }
        dialog!!.show()

    }

    /**
     * 关闭等待框
     */
    fun dismissLoading() {
        dialog?.run { if (isShowing) dismiss() }
    }



    private fun initBinding(inflater: LayoutInflater, container: ViewGroup?): View {
        val type = javaClass.genericSuperclass
        if (type is ParameterizedType) {
            val cls = type.actualTypeArguments[1] as Class<*>
            return when {
                ViewBinding::class.java.isAssignableFrom(cls) && cls != ViewBinding::class.java -> {
                    cls.getDeclaredMethod("inflate", LayoutInflater::class.java).let {
                        @Suppress("UNCHECKED_CAST")
                        mBinding = it.invoke(null, inflater) as VB
                        mBinding.root
                    }
                }
                else -> {
                    if (layoutId() == 0) throw IllegalArgumentException("If you don't use ViewBinding, you need to override method layoutId")
                    inflater.inflate(layoutId(), container, false)
                }
            }
        } else throw IllegalArgumentException("Generic error")
    }

    /**
     * 创建 ViewModel
     *
     * 共享 ViewModel的时候，重写  Fragmnt 的 getViewModelStore() 方法，
     * 返回 activity 的  ViewModelStore 或者 父 Fragmnt 的 ViewModelStore
     */
    @Suppress("UNCHECKED_CAST")
    private fun createViewModel() {
        val type = javaClass.genericSuperclass
        if (type is ParameterizedType) {
            val tp = type.actualTypeArguments[0]
            val tClass = tp as? Class<VM> ?: BaseViewModel::class.java
            viewModel = ViewModelProvider(viewModelStore, defaultViewModelProviderFactory)
                .get(tClass) as VM
        }
    }

    override fun getDefaultViewModelProviderFactory(): ViewModelProvider.Factory {
        return Mvvm.getConfig().viewModelFactory() ?: super.getDefaultViewModelProviderFactory()
    }

}