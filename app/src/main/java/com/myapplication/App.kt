package com.example.myapplication

import android.app.Application
import android.util.Log
import com.alibaba.android.arouter.launcher.ARouter


/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
class App :Application() {
    override fun onCreate() {
        super.onCreate()
        if (true) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        Log.e("LYH","初始化路由器");
        ARouter.init(this);

    }
}