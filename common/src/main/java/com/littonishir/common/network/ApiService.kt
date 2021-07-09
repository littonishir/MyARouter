package com.littonishir.common.network

import com.littonishir.common.model.DaiLiRes
import com.littonishir.network.entity.ApiResult
import com.littonishir.common.network.other.Login
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*


/**
 * Created by kohana on 2021/6/28.
 */
interface ApiService {

    @POST(NetUrl.BROKERTOKEN)
    suspend fun token(@Body requestBody: RequestBody): ApiResult<String>

    @POST(NetUrl.LISTPAGE)
    suspend fun listPage(@Body requestBody: RequestBody): ApiResult<DaiLiRes.Data>

    @GET(NetUrl.BROKERUSERINFO)
    suspend fun login(): ApiResult<Login>


//    @GET
//    suspend fun <T> getQueryMap(@Url url: String, @QueryMap map: Map<String, String>?): ApiResult<T>
//
//    @POST
//    suspend fun <T> post(@Url url: String): ApiResult<T>
//
//    @POST
//    suspend fun postBody(@Url url: String, @Body requestBody: RequestBody): ApiResult<RentHouse>
//    @POST
//    suspend fun <T>postBodyt(@Url url: String, @Body requestBody: RequestBody): ApiResult<T>
    /**
     * 图片上传
     */
    @POST
    @Multipart
    fun upload(@Url url: String, @Part file: MultipartBody.Part): Call<ResponseBody>

    @DELETE
    fun restfulDelete(@Url url: String): Call<ResponseBody>

    @PUT
    fun restfulPut(@Url url: String, @Body requestBody: RequestBody): Call<ResponseBody>

    /**
     * suspend get:支持挂起的retrofitGets请求
     */
    @GET
    fun restfulGet(@Url url: String): Call<ResponseBody>

    @GET
    fun retrofitGets(@Url url: String, @QueryMap map: Map<String, String>?): Call<ResponseBody>

    /**
     * suspend post:支持挂起的retrofitPosts请求
     */
    @POST
    fun retrofitPost(@Url url: String): Call<ResponseBody>

    /**
     * suspend post:支持挂起的retrofitBody请求
     */
    @POST
    fun retrofitBody(@Url url: String, @Body requestBody: RequestBody): Call<ResponseBody>
//    fun retrofitBody(@Url url: String, @Body requestBody: RequestBody): Call<JujianKe>



}

