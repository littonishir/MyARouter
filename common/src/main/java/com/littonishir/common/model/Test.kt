package com.littonishir.common.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Test(@JvmField val s: String, @JvmField val s1: String): Parcelable
