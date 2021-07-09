package com.littonishir.myarouter.ui

import android.os.Bundle
import android.util.Log
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.common.base.BaseActivity
import com.littonishir.common.base.NoViewModel
import com.littonishir.common.model.Test
import com.littonishir.common.model.TestParcelable
import com.littonishir.common.model.TestSerializable
import com.littonishir.common.model.Truck
import com.littonishir.myarouter.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@Route(path = "/myarouter/MainActivity")
@AndroidEntryPoint
class MainActivity : BaseActivity<NoViewModel, ActivityMainBinding>() {

    @Inject
    lateinit var truck: Truck

    override fun initView(savedInstanceState: Bundle?) {
//        showLoading()
        binding.start.setOnClickListener {
            val test = Test("ojkojoj", "123456")
            val testSerializable = TestSerializable("Titanic", 555)
            val testParcelable = TestParcelable("jack", 666)
            try {
                truck.deliver()

            } catch (e: Exception) {
                e.printStackTrace()
            }
            ARouter.getInstance().build("/my/MyActivity").navigation()
            return@setOnClickListener
            ARouter.getInstance().build("/home/HomeActivity")
                .withLong("key1", 666L)
                .withString("key3", "888")
                .withSerializable("ser", testSerializable)
                .withParcelable("pac", test)
                .navigation(this, object : NavCallback() {
                    override fun onArrival(postcard: Postcard) {

                    }

                    override fun onInterrupt(postcard: Postcard?) {
                        Log.d("ARouter", "被拦截了")
                    }
                })
        }
    }
}