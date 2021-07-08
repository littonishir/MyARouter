package com.littonishir.home

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.common.model.Test
import com.littonishir.common.model.TestParcelable
import com.littonishir.common.model.TestSerializable


@Route(path = "/home/HomeActivity")
class HomeActivity : AppCompatActivity() {
    @JvmField
    @Autowired(name ="key1" )
    var ok1:Long = 0

    @Autowired(name ="key3" )
    lateinit var str: String

    @Autowired
    lateinit var ser: TestSerializable

    @Autowired
    lateinit var pac: Test

    @Autowired(name ="Interceptor" )
    lateinit var mInterceptor: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ARouter.getInstance().inject(this)  // Start auto inject.



        val tv = findViewById<TextView>(R.id.tv)

        tv.setOnClickListener {
            ARouter.getInstance().build("/myarouter/MainActivity2").navigation()

        }

    }
}