package com.littonishir.common.network

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.littonishir.network.retrofit2.BaseRetrofit2
import com.littonishir.common.network.interceptor.HttpLogInterceptor
import com.littonishir.common.network.interceptor.TokenInterceptor
import com.littonishir.network.other.SSLSocketClient
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.net.ssl.X509TrustManager

//双重校验锁式-单例 封装NetApiService 方便直接快速调用简单的接口
val apiService: ApiService by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
    RetrofitHelper.instance.getApi(ApiService::class.java, NetUrl.BASE_URL)
}

class RetrofitHelper private constructor() : BaseRetrofit2() {

    override fun setHttpClientBuilder(builder: OkHttpClient.Builder): OkHttpClient.Builder {
        builder.apply {
            addNetworkInterceptor(HttpLogInterceptor.init())
            addInterceptor(TokenInterceptor())
            sslSocketFactory(SSLSocketClient.sSLSocketFactory, SSLSocketClient.trustManager[0] as X509TrustManager)
            builder.hostnameVerifier(SSLSocketClient.hostnameVerifier)//配置
        }
        return builder
    }

    override fun setRetrofitBuilder(builder: Retrofit.Builder): Retrofit.Builder {
        return builder.apply {
//            addConverterFactory(GsonConverterFactory.create())
            addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
        }
    }

    companion object {
        @JvmStatic
        val instance: RetrofitHelper by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            RetrofitHelper()
        }
    }
}

/**
 * 将map数据转换为 普通的 json RequestBody
 * @param map 以前的请求参数
 * @return
 */
fun convertRequestBody(map: Any): RequestBody = Gson().toJson(map).toRequestBody("application/json;charset=utf-8".toMediaTypeOrNull())
