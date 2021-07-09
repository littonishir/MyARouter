package com.littonishir.common.network.interceptor


import com.littonishir.retrofitsample.utils.MyConst
import com.littonishir.retrofitsample.utils.getStringX
import com.littonishir.retrofitsample.utils.saveStringX
import com.littonishir.common.network.NetUrl
import okhttp3.Response

/**
 * Created by kohana on 2021/6/28.
 */
class TokenInterceptor : okhttp3.Interceptor {

    @Throws(java.io.IOException::class)
    override fun intercept(chain: okhttp3.Interceptor.Chain): Response {
        val request = chain.request()
        /**
         * 获取令牌，并保存。（获取时除外）
         * 默认情况均传如token·session_id·clientType
         */
        return when (request.url.encodedPath.substring(1)) {
            NetUrl.BROKERTOKEN, NetUrl.CUSTOMERTOKEN -> {
                val response = chain.proceed(request)
                saveStringX(MyConst.TOKEN_CLIENT, response.header("token"))
                saveStringX(MyConst.CLIENTTYPE, response.header("clientType"))
                response
            }
            else -> {
                val builder = request.newBuilder()
                builder.header("token", getStringX(MyConst.TOKEN_CLIENT))
                builder.header("clientType", getStringX(MyConst.CLIENTTYPE))
                chain.proceed(builder.build())
            }
        }
    }
}
