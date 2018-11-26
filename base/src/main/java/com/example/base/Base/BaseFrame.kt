package com.example.base.Base

import android.os.Bundle
import android.support.v4.app.Fragment

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
abstract class BaseFrame: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //布局ID
    abstract fun getlayoutxmlid():Int;
    //初始化
    abstract fun  init();
    //初始化数据
    abstract fun initdata();
}