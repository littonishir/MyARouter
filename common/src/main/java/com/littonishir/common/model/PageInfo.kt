package com.littonishir.common.model

class PageInfo {
    var page = 1
    var size = 10
    fun nextPage() {
        page++
    }

    fun reset() {
        page = 1
    }

    val isFirstPage: Boolean
        get() = page == 1
}