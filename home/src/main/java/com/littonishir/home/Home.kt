package com.littonishir.home

import android.app.Application
import android.util.Log

class Home : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.e("ttt", "Home,onCreate")
        instance = this


    }
    companion object {
        private lateinit var instance: Home
    }
}