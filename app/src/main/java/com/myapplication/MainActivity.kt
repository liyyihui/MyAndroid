package com.example.myapplication

import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.Base.BaseActivity


class MainActivity : BaseActivity() {
    override fun getlayoutxmlid(): Int {
          return  R.layout.activity_main;
    }

    override fun init() {
       //跳转到登录页面
       //ARouter.getInstance().build("/login/activity").navigation();
        ARouter.getInstance().build("/main/home").navigation();
    }

    override fun initdata() {

    }



}
