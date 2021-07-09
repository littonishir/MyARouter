package com.littonishir.common.app

import androidx.lifecycle.ViewModelProvider
import com.littonishir.common.base.ViewModelFactory
import com.littonishir.common.network.other.ExceptionHandle

/**
 * Created by kohana on 2021/7/9.
 */
interface GlobalConfig {

    fun viewModelFactory(): ViewModelProvider.Factory? = ViewModelFactory.getInstance()

    fun globalExceptionHandle(e: Throwable) = ExceptionHandle.handleException(e)

}