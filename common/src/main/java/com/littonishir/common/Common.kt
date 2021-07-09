package com.littonishir.common

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.network.utils.RetrofitUtil
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.unit.Subunits

class Common : Application() {
    override fun onCreate() {
        super.onCreate()
        mContext = this
        RetrofitUtil.init(this)
        initARouter()
        initAuto()
    }

    private fun initARouter() {
        ARouter.openLog()
        ARouter.openDebug()
        ARouter.init(this)
    }
    private fun initAuto() {
        AutoSizeConfig.getInstance().unitsManager.setSupportDP(false).supportSubunits = Subunits.MM
    }

    companion object {
        lateinit var mContext: Common
    }
}