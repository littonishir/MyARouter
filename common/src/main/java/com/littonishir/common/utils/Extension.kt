package com.littonishir.retrofitsample.utils

import android.util.Log
import android.view.Gravity
import android.widget.Toast
import com.littonishir.common.utils.SpHelper
import com.littonishir.network.utils.RetrofitUtil.Companion.mContext

/**
 * 保存数据
 * @param spKey MyConst.TOKEN
 * @param string {json}
 */
fun saveStringX(spKey: String, string: String?) =
    SpHelper.setParam(mContext, spKey, string?:"")

/**
 * 获取数据
 * @param spKey MyConst.TOKEN
 */
fun getStringX(spKey: String) = SpHelper.getParam(mContext, spKey, "").toString()

/**
 * com.littonishir.retrofitsample.utils.showToast
 * @param message
 * @param showCenter 是否在屏幕中间显示 默认底部显示
 */
fun showToast(message: String?, showCenter: Boolean = false, gravity: Int = Gravity.BOTTOM) {
    try {
        if (message != null) {
            Log.e("hilt",message)
        }
        val toast: Toast = Toast.makeText(mContext, null, Toast.LENGTH_SHORT)
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