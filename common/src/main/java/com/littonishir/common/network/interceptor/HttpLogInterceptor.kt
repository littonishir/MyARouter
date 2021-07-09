package com.littonishir.common.network.interceptor

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor
/**
 * Created by kohana on 2021/6/28.
 */
object HttpLogInterceptor {
    fun init(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor { message ->
            Log.e("retrofit", message)
        }.also { it.level = HttpLoggingInterceptor.Level.BODY }
    }
}