package com.littonishir.common.interceptor

import android.content.Context
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Interceptor
import com.alibaba.android.arouter.facade.callback.InterceptorCallback
import com.alibaba.android.arouter.facade.template.IInterceptor
//多个拦截器会按优先级顺序依次执行
@Interceptor(priority = 8, name = "测试用拦截器")
class TestInterceptor : IInterceptor {
    override fun init(context: Context) {
        // 拦截器的初始化，会在sdk初始化的时候调用该方法，仅会调用一次
    }

    override fun process(postcard: Postcard, callback: InterceptorCallback) {
        if ("/home/HomeActivity" == postcard.path) {
            //中止路由
            //callback.onInterrupt(null)
            //拦截器中附加参数
            postcard.withString("Interceptor", "我是在拦截器中附加的参数")
            callback.onContinue(postcard)
        } else {
            //继续路由
            callback.onContinue(postcard)
        }
    }
}