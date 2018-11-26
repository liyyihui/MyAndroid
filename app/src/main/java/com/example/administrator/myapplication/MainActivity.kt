package com.example.administrator.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = 2 ;
        var b : Int = 0;
        var test = " a is $a";
        a = 3;
        Log.e("LYH","${test.replace("is", "was")}, but now is $a")
    }
   fun maxof(a:Int,b:Int):Int{
       return  if (a>b) a else b ;
   }
}
