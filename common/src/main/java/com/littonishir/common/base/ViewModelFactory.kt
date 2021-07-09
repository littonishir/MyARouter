package com.littonishir.common.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Created by kohana on 2021/7/9.
 */
class ViewModelFactory : ViewModelProvider.Factory {

    companion object {
        private var sInstance: ViewModelFactory? = null

        fun getInstance() = sInstance ?: ViewModelFactory().also { sInstance = it }
    }


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.newInstance()
    }
}