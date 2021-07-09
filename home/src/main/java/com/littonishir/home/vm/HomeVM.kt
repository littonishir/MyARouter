package com.littonishir.home.vm

import androidx.lifecycle.MutableLiveData
import com.littonishir.common.base.BaseViewModel
import com.littonishir.common.model.DaiLiRes
import com.littonishir.common.network.other.Login
import com.littonishir.home.repo.HomeRepo
import okhttp3.RequestBody

/**
 * Created by kohana on 2021/7/9.
 */
class HomeVM : BaseViewModel() {
    private val repo = HomeRepo()
    val list = MutableLiveData<DaiLiRes.Data>()


    fun homeList(requestBody: RequestBody) {
        launchGo({
            val homeList = repo.homeList(requestBody)
            if (homeList.isSuccess()){
                val data = homeList.data
                list.postValue(homeList.data!!)
            }
        })
    }

}