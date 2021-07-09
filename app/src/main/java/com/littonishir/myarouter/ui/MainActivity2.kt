package com.littonishir.myarouter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.myarouter.R
@Route(path = "/myarouter/MainActivity2")
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun oksdf(view: View) {
                    ARouter.getInstance().build("/my/MyActivity").navigation()

    }
}