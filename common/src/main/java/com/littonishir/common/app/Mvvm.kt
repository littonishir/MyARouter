package com.littonishir.common.app

/**
 * Created by kohana on 2021/7/9.
 */
object Mvvm {

    private val DEFULT = object : GlobalConfig {}

    private var mConfig: GlobalConfig = DEFULT

    fun install(config: GlobalConfig) {
        mConfig = config
    }

    fun getConfig() = mConfig

}