package com.littonishir.common.utils

import android.view.Gravity
import android.widget.Toast
import com.littonishir.common.Common

/**
 * showToast
 * @param message
 * @param showCenter 是否在屏幕中间显示 默认底部显示
 */
fun showToast(message: String?, showCenter: Boolean = false, gravity: Int = Gravity.BOTTOM) {
    try {
        val toast: Toast = Toast.makeText(Common.mContext, null, Toast.LENGTH_SHORT)
        toast.setText(message)
        if (showCenter) {
            toast.setGravity(Gravity.CENTER, 0, 0)
        } else {
            toast.setGravity(gravity, 0, 200)
        }
        toast.show()
    } catch (e: NullPointerException) {
    }
}