package com.littonishir.common.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.littonishir.common.app.Mvvm
import com.littonishir.common.event.Message
import com.littonishir.common.utils.showToast
import com.littonishir.common.widget.LoadingDialog
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

/**
 * Created by kohana on 2021/7/9.
 */
abstract class BaseActivity<VM : BaseViewModel, VB : ViewBinding> : AppCompatActivity() {

    protected lateinit var viewModel: VM

    protected lateinit var binding: VB

    private var dialog: LoadingDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        registerDefUIChange()
        lifecycle.addObserver(viewModel)

        initView(savedInstanceState)
        initData()
    }

    open fun layoutId(): Int = 0
    abstract fun initView(savedInstanceState: Bundle?)
    open fun initData() {}

    private fun initViewBinding() {
        val type = javaClass.genericSuperclass
        if (type is ParameterizedType) {
            val cls = type.actualTypeArguments[1] as Class<*>
            when {
                ViewBinding::class.java.isAssignableFrom(cls) && cls != ViewBinding::class.java -> {
                    cls.getDeclaredMethod("inflate", LayoutInflater::class.java).let {
                        @Suppress("UNCHECKED_CAST")
                        binding = it.invoke(null, layoutInflater) as VB
                        setContentView(binding.root)
                    }
                }
                else -> {
                    if (layoutId() == 0) throw IllegalArgumentException("If you don't use ViewBinding, you need to override method layoutId")
                    setContentView(layoutId())
                }
            }
            createViewModel(type.actualTypeArguments[0])
        } else throw IllegalArgumentException("Generic error")
    }


    /**
     * 注册 UI 事件
     */
    private fun registerDefUIChange() {
        viewModel.defUI.apply {
            showDialog.observe(this@BaseActivity, {
                showLoading()
            })
            dismissDialog.observe(this@BaseActivity, {
                dismissLoading()
            })
            toastEvent.observe(this@BaseActivity, {
                showToast(it)
            })
            msgEvent.observe(this@BaseActivity, {
                handleEvent(it)
            })
        }
    }

    open fun handleEvent(msg: Message) {}

    /**
     * 打开等待框
     */
    fun showLoading() {

        if (dialog == null) {
            dialog = LoadingDialog(this, false)
        }
        dialog!!.show()

    }

    /**
     * 关闭等待框
     */
    fun dismissLoading() {
        dialog?.run { if (isShowing) dismiss() }
    }


    /**
     * 创建 ViewModel
     * viewModel = ViewModelProvider(this).get(tClass) as VM
     */
    @Suppress("UNCHECKED_CAST")
    private fun createViewModel(type: Type) {
        val tClass = type as? Class<VM> ?: BaseViewModel::class.java
        viewModel = ViewModelProvider(viewModelStore, defaultViewModelProviderFactory).get(tClass) as VM
    }

    override fun getDefaultViewModelProviderFactory(): ViewModelProvider.Factory {
        return Mvvm.getConfig().viewModelFactory() ?: super.getDefaultViewModelProviderFactory()
    }

}