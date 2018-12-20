package com.example.base.Base.Longin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.base.R

/**
 * Author by LYH, Email myliuyihui@163.com, Date on 2018/11/26 0026.
 * PS: Not easy to write code, please indicate.
 */
class longin_frame :Fragment() {
       private lateinit var registered: TextView;
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         var view :View ?
        view =  inflater.inflate(R.layout.longinframe,container,false);
        minit(view);
        return view
    }

   fun minit(view : View?){
       if (view != null) {
           registered = view.findViewById(R.id.registered)
           registered.setOnClickListener {
               Navigation.findNavController(registered).navigate(R.id.action_longin_frame_to_registered_frame)

           }
       };
   }

}