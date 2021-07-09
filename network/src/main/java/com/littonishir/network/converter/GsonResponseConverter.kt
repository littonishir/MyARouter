package com.littonishir.network.converter

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.littonishir.network.entity.ApiResultError
import com.littonishir.network.entity.Meta
import com.littonishir.network.exception.ResultException
import okhttp3.ResponseBody
import retrofit2.Converter
import java.io.IOException
import java.lang.reflect.Type


class GsonResponseConverter<T>(private val gson: Gson, private val type: Type) : Converter<ResponseBody, T> {
    @Throws(IOException::class)
    override fun convert(value: ResponseBody): T {
        val response = value.string()
        return value.use {
            val jsonObject = JsonParser().parse(response) as JsonObject
            val meta = gson.fromJson(jsonObject["meta"].toString(), Meta::class.java)
            if (meta.code != "200") {
                gson.fromJson(response, ApiResultError::class.java).apply {
                    val resultException = ResultException(meta.message, meta.code, data)
                    resultException.json = response
                    throw resultException
                }
            }
            gson.fromJson(response, type)
        }
    }
}