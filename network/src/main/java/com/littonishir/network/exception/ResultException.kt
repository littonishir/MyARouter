package com.littonishir.network.exception

import java.io.IOException

class ResultException : IOException {
    var msg: String
    var code: String
    var json:String=""

    constructor(msg: String, code: String) {
        this.msg = msg
        this.code = code
    }

    constructor(message: String?, code: String, msg: String) : super(message) {
        this.msg = msg
        this.code = code
    }
}