package com.example.base.Base.Longin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.base.R

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
class registered_frame : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      //  return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.registeredframe,container,false);
    }
}