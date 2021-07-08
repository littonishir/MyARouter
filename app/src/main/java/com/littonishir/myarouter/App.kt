package com.littonishir.myarouter

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.littonishir.common.Common
import com.littonishir.myarouter.utils.isDebug

class App : Application() {
    private var moduleApplication : Common? = null

    override fun onCreate() {
        super.onCreate()
//        initARouter()
        iniLibApp()
    }


    private fun initARouter() {
        if (isDebug(this)) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }

    private fun iniLibApp() {
        //同步Module的Application的onCreate
        if (moduleApplication != null) {
            moduleApplication!!.onCreate() //用于执行module的一些自定义初始化操作
        }
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        moduleApplication = getModuleApplicationInstance(this)
        try {
            //通过反射调用moduleApplication的attach方法
            val method = Application::class.java.getDeclaredMethod("attach", Context::class.java)
            if (method != null) {
                method.isAccessible = true
                method.invoke(moduleApplication, baseContext)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    //映射获取ModuleApplication
    private fun getModuleApplicationInstance(paramContext: Context): Common? {
        try {
            if (moduleApplication == null) {
                val classLoader = paramContext.classLoader
                if (classLoader != null) {
                    val mClass = classLoader.loadClass(Common::class.java.name)
                    if (mClass != null) moduleApplication = mClass.newInstance() as Common
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return moduleApplication
    }
}