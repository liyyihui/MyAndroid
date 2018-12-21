package com.example.base.Base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gyf.barlibrary.ImmersionBar

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
abstract class BaseActivity : AppCompatActivity() {
    protected lateinit var immersionBar: ImmersionBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getlayoutxmlid())
        inintbar();
        init();
        initdata();

    }
    //布局ID
    abstract fun getlayoutxmlid():Int;
    //初始化
    abstract fun  init();
    //初始化数据
    abstract fun initdata();
    //初始化状态栏
    open fun inintbar(){
        immersionBar = ImmersionBar.with(this)
        immersionBar.init()
    };
    override fun onDestroy() {
        super.onDestroy()
        immersionBar.destroy()
    }

}