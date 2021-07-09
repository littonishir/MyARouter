package com.littonishir.network.retrofit2

import okhttp3.OkHttpClient
import retrofit2.Retrofit

abstract class BaseRetrofit2 {

   inline fun <reified T> getApi(apiService: Class<T>, baseUrl: String): T {
        val retrofitBuilder = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
        return setRetrofitBuilder(retrofitBuilder).build().create(apiService)
    }

    /**
     * override setHttpClientBuilder
     * 在这里可以对 OkHttpClient.Builder 做任意操作,例如：添加拦截器...等等.
     */
    abstract fun setHttpClientBuilder(builder: OkHttpClient.Builder): OkHttpClient.Builder

    /**
     * override setRetrofitBuilder
     * 在这里可以对 Retrofit.Builder 做任意操作,例如：添加GSON解析器...等等.
     */
    abstract fun setRetrofitBuilder(builder: Retrofit.Builder): Retrofit.Builder

    val okHttpClient: OkHttpClient
        get() {
            var builder = OkHttpClient.Builder()
            builder = setHttpClientBuilder(builder)
            return builder.build()
        }

}



