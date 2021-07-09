package com.littonishir.my

import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.common.base.BaseActivity
import com.littonishir.common.base.NoViewModel
import com.littonishir.common.utils.showToast
import com.littonishir.my.databinding.ActivityMyBinding
import com.littonishir.my.viewmodel.LoginVM
import java.util.HashMap

@Route(path = "/my/MyActivity")
class MyActivity : BaseActivity<LoginVM, ActivityMyBinding>() {


    fun skdfjsd(view: View) {

        ARouter.getInstance().build("/myarouter/MainActivity").navigation()

    }

    override fun initView(savedInstanceState: Bundle?) {
        binding.apply {

            button.setOnClickListener {
                etCount.setText("lijinglong")
                etPassword.setText("qw123456")
            }

            login.setOnClickListener {
                val etCount = etCount.text.toString().trim()
                val etPassword = etPassword.text.toString().trim()
                val map = HashMap<String, String>()
                map["principals"] = etCount
                map["credentials"] = etPassword
                map["osType"] = "android"
                map["clientType"] = "broker"
                map["deviceToken"] = "uuidwe897589234792589"
                map["isLoginEd"] = "false"
                map["uuid"] = ""
                map["code"] = ""
                viewModel.doLogin(map)
            }
        }
        viewModel.loginInfo.observeForever {
            showToast("登陆成功")
            ARouter.getInstance().build("/home/HomeActivity").navigation()

        }


    }
}