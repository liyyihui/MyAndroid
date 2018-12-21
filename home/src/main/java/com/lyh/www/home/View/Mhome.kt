package com.lyh.www.home.View



import com.example.base.Base.BaseActivity
import com.lyh.www.home.R
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.Base.utils.Util
import com.gyf.barlibrary.ImmersionBar


@Route(path = "/main/home")
class Mhome : BaseActivity() {

    override fun getlayoutxmlid(): Int {
        return  R.layout.activity_mhome;
    }

    override fun init() {
        Util.log("首页")
        immersionBar.titleBar(R.id.toolbar).init()
        ARouter.getInstance().inject(this);


    }

    override fun initdata() {

    }



    }








