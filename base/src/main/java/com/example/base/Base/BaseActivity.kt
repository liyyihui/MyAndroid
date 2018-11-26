package com.example.base.Base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
abstract class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getlayoutxmlid())
        init();
        initdata();

    }
    //布局ID
    abstract fun getlayoutxmlid():Int;
    //初始化
    abstract fun  init();
    //初始化数据
    abstract fun initdata();
}