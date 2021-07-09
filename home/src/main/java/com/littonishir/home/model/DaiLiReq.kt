package com.yyzf.moonhouse.entity.broker

data class DaiLiReq(
    var page: Page = Page(),
    var `param`: Param = Param()
) {
    data class Page(
        var orderBy: ArrayList<String> = ArrayList(),
        var pageNo: Int = 1,
        var pageSize: Int = 20
    )

    data class Param(
        var accountCode: String = "",
        var communityName: String = "",
        var detailAddr: String = "",
        var highPrice: String = "",
        var lowPrice: String = "",
        var maxArea: String ="",
        var minArea: String = "",
        var officeCode: String = "",
        var orientationType: String = "",
        var ownFlag: Int = 0,//0全部 1我的
        var queryStr: String = "",
        var regionId: String = "",
        var rentMaxDay: String = "",
        var rentMinDay: String = "",
        var rentalWayType: ArrayList<String> = ArrayList(),
        var searchName: String = "",
        var searchValue: String = "",
        var tradeAreaId: String = "",
        /**
         * 业主直租的字段
         */
        var rentalWayTypeList: ArrayList<String> = ArrayList(),
        var opportunityStatus: String = "",
        )
}