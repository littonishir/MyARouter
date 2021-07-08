package com.littonishir.myarouter.ui

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavCallback
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.common.model.Test
import com.littonishir.common.model.TestParcelable
import com.littonishir.common.model.TestSerializable
import com.littonishir.home.ui.BlankFragment
import com.littonishir.myarouter.R


@Route(path = "/myarouter/MainActivity")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.start).setOnClickListener {

            val test = Test("ojkojoj", "123456")
            val testSerializable = TestSerializable("Titanic", 555)
            val testParcelable = TestParcelable("jack", 666)
//            ARouter.getInstance().build("/my/MyActivity").navigation()
//            return@setOnClickListener
            ARouter.getInstance().build("/home/HomeActivity")
                .withLong("key1", 666L)
                .withString("key3", "888")
                .withSerializable("ser", testSerializable)
                .withParcelable("pac", test)
                .navigation(this,object : NavCallback(){
                    override fun onArrival(postcard: Postcard) {

                    }
                    override fun onInterrupt(postcard: Postcard?) {
                        Log.d("ARouter", "被拦截了")
                    }
                })
        }
    }
}