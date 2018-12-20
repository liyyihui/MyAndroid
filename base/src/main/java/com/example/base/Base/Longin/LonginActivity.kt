package com.example.base.Base.Longin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

import com.example.base.Base.BaseActivity
import com.example.base.R

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
 @Route(path = "/login/activity")
class LonginActivity : BaseActivity() {


    override fun getlayoutxmlid(): Int {
            return R.layout.longin_activity;
    }

    override fun init() {
     Log.e("LYH","登录页面");
        ARouter.getInstance().inject(this);
    }

    override fun initdata() {

    }

    //override fun onSupportNavigateUp() =  NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_login)!!).navigateUp()
     //将back事件委托出去。若栈中有两个以上Fragment，点击back键就会返回到上一个Fragment。
    override fun onSupportNavigateUp(): Boolean {
        var fragment :Fragment?;
        fragment = getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_login);
        return NavHostFragment.findNavController(fragment!!).navigateUp();
    }
}