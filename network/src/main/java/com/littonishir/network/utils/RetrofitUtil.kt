package com.littonishir.network.utils

import android.annotation.SuppressLint
import android.content.Context

class RetrofitUtil {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var mContext: Context

        /**
         * 获取APP Context
         */
        fun init(context: Context) {
            mContext = context
        }
    }
}