package com.littonishir.network.entity

import com.google.gson.Gson

/**
 * Created by kohana on 2021/6/24.
 */

data class ApiResult<T>(
    var meta: Meta = Meta(),
    var data: T ,
) : BaseResponse<T>() {

    override fun isSuccess(): Boolean {
        return meta.code == "200"
    }

    override fun getCode(): Int {
        return meta.code.toInt()
    }

    override fun getMessage(): String {
        return meta.message
    }

    fun cover(clazz: Class<T>): T {
        val toJson = Gson().toJson(data)
        return Gson().fromJson(toJson, clazz)
    }
}
