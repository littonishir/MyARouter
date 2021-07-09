package com.littonishir.common.model

data class DaiLiRes(
    val `data`: Data = Data(),
    val meta: Meta = Meta()
) {
    data class Data(
        val rows: MutableList<Row> = mutableListOf(),
        val total: Int = 0
    ) {
        data class Row(
            val area: String = "",
            val bedroomPicOssUrl: String = "",
            val bedroomType: Int = 0,
            val communityName: String = "",
            val currentFloor: String = "",
            val dataType: Int = 0,
            val floor: String = "",
            val houseType: Int = 0,
            val houseStatus: Int = 0,
            val imageCount: Int = 0,
            val key: Any = Any(),
            val linkMan: String = "",
            val linkMobile: String = "",
            val markPrice: String = "",
            val moveInDate: String = "",
            val oldAccountCode: String = "",
            val orientation: String = "",
            val registerDate: String = "",
            val rentPeriod: String = "",
            val rentType: String = "",
            val rentalWay: String = "",
            val roomCount: Int = 0,
            val roomId: Int = 0,
            val roomNum: String = "",
            val storeName: String = "",
            val tradeArea: String = "",
            val vacantDays: String = "",
            val vrFlag: Int = 0
        )
    }

    data class Meta(
        val code: String = "",
        val message: String = ""
    )
}