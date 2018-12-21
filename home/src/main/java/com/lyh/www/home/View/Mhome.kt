package com.lyh.www.home.View


import com.example.base.Base.BaseActivity
import com.lyh.www.home.R
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.example.base.Base.utils.Util


@Route(path = "/main/home")
class Mhome : BaseActivity() {



    override fun getlayoutxmlid(): Int {
         return  R.layout.activity_mhome;
    }

    override fun init() {
           Util.log("首页")
        ARouter.getInstance().inject(this);
    }

    override fun initdata() {

    }


}
