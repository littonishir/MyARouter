package com.littonishir.common.utils

import android.content.Context

/**
 * 用户账户信息保存工具类
 */
object SpHelper {

    private val FILE_NAME = "FILE_NAME"
    private val PREFERENCE_NAME = "FILE_NAME"
    var SEARCH_HISTORY = "linya_history"

    /**
     * 保存数据的方法，我们需要拿到保存数据的具体类型，然后根据类型调用不同的保存方法
     *
     * @param context
     * @param key
     * @param object
     */
    fun setParam(context: Context, key: String, `object`: Any,file:String= FILE_NAME) {

        val type = `object`.javaClass.simpleName
        val sp = context.getSharedPreferences(file, Context.MODE_PRIVATE)
        val editor = sp.edit()

        when (type) {
            "String" -> editor.putString(key, `object` as String)
            "Integer" -> editor.putInt(key, `object` as Int)
            "Boolean" -> editor.putBoolean(key, `object` as Boolean)
            "Float" -> editor.putFloat(key, `object` as Float)
            "Long" -> editor.putLong(key, `object` as Long)
        }

        editor.apply()
    }


    /**
     * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
     *
     * @param context
     * @param key
     * @param defaultObject
     * @return
     */
    fun getParam(context: Context, key: String, defaultObject: Any,file:String= FILE_NAME): Any? {
        val type = defaultObject.javaClass.simpleName
        val sp = context.getSharedPreferences(file, Context.MODE_PRIVATE)

        if ("String" == type) {
            return sp.getString(key, defaultObject as String)
        } else if ("Integer" == type) {
            return sp.getInt(key, defaultObject as Int)
        } else if ("Boolean" == type) {
            return sp.getBoolean(key, defaultObject as Boolean)
        } else if ("Float" == type) {
            return sp.getFloat(key, defaultObject as Float)
        } else if ("Long" == type) {
            return sp.getLong(key, defaultObject as Long)
        }

        return null
    }

    /**
     * 清除所有数据
     *
     * @param context
     */
    fun clear(context: Context) {
        val sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.clear().apply()
    }

    /**
     * 清除指定数据
     *
     * @param context
     */
    fun clearAll(context: Context,key: String) {
        val sp = context.getSharedPreferences(FILE_NAME,
                Context.MODE_PRIVATE)
        val editor = sp.edit()
        editor.remove(key)
        editor.apply()
    }

}