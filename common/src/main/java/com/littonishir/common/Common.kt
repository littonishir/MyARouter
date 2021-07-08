package com.littonishir.common

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter

class Common : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
        initARouter()
    }

    private fun initARouter() {
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }


    companion object {
        private lateinit var instance: Common
    }
}