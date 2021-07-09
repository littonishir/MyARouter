package com.littonishir.home.repo

import com.littonishir.common.base.BaseModel
import com.littonishir.common.model.DaiLiRes
import com.littonishir.common.network.apiService
import com.littonishir.network.entity.ApiResult
import okhttp3.RequestBody

/**
 * Created by kohana on 2021/7/9.
 */
class HomeRepo:BaseModel() {
    suspend fun homeList(req: RequestBody): ApiResult<DaiLiRes.Data> {
        val listPage = apiService.listPage(req)
        return listPage

    }
}