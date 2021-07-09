package com.littonishir.common.base

import com.littonishir.common.network.other.ResponseThrowable

/**
 * Created by kohana on 2021/7/9.
 */
abstract class BaseModel {

    /**
     * @param remoto 网络数据
     * @param local 本地数据
     * @param save 当网络请求成功后，保存数据等操作
     * @param isUseCache 是否使用缓存
     */
    suspend fun <T> cacheNetCall(
        remoto: suspend () -> IBaseResponse<T>,
        local: suspend () -> T?,
        save: suspend (T) -> Unit,
        isUseCache: (T?) -> Boolean = { true },
    ): T {
        val localData = local.invoke()
        return if (isUseCache(localData) && localData != null) localData
        else {
            remoto().let { net ->
                if (net.isSuccess()) net.data().also { save(it) }
                throw ResponseThrowable(net)
            }
        }
    }

    fun onCleared() {
    }
}