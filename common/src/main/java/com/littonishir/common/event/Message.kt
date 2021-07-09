package com.littonishir.common.event

/**
 * Created by kohana on 2021/7/9.
 */
class Message @JvmOverloads constructor(
    var code: Int = 0,
    var msg: String = "",
    var arg1: Int = 0,
    var arg2: Int = 0,
    var obj: Any? = null
)