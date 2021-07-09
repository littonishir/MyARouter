package com.littonishir.my.viewmodel

import androidx.lifecycle.MutableLiveData
import com.littonishir.common.base.BaseViewModel
import com.littonishir.common.network.convertRequestBody
import com.littonishir.common.network.other.Login
import com.littonishir.my.repository.LoginRepo
import com.littonishir.network.entity.ApiResult
import com.littonishir.retrofitsample.utils.showToast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

/**
 * Created by kohana on 2021/7/9.
 */
class LoginVM : BaseViewModel() {
    private val repo = LoginRepo()
    val loginInfo = MutableLiveData<Login>()


    fun doLogin(any: Any) {
        launchGo({
            val token = async {repo.token(convertRequestBody(any))  }.await()
            val login = repo.login()
            if (login.isSuccess()){
                loginInfo.postValue(login.data!!)
            }else{
                showToast(login.getMessage())
            }

        })
    }


}