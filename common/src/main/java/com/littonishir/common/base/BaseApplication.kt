package com.littonishir.common.base

import android.app.Application
import android.content.Context

/**
 * Created by kohana on 2021/7/9.
 */
open class BaseApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}