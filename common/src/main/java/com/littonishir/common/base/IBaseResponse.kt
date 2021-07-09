package com.littonishir.common.base

/**
 * Created by kohana on 2021/7/9.
 */
interface IBaseResponse<T> {
    fun code(): Int
    fun msg(): String
    fun data(): T
    fun isSuccess(): Boolean
}