package com.littonishir.my.repository

import com.littonishir.common.base.BaseModel
import com.littonishir.common.network.apiService
import com.littonishir.common.network.other.Login
import com.littonishir.network.entity.ApiResult
import okhttp3.RequestBody

/**
 * Created by kohana on 2021/7/9.
 */
class LoginRepo:BaseModel() {

    suspend fun token(convertRequestBody: RequestBody): ApiResult<String> {
        return apiService.token(convertRequestBody)
    }
    suspend fun login(): ApiResult<Login> {
        return apiService.login()
    }
}