package com.littonishir.common.model

import com.littonishir.common.utils.showToast
import javax.inject.Inject

class Truck @Inject constructor() {

    fun deliver() {
        showToast("Truck is delivering cargo.")
    }

}

