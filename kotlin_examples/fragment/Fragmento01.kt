package com.example.appfragmento

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fragmento01.*


/**
 * A simple [Fragment] subclass.
 */
class Fragmento01 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento01, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var resultado = .0
        resultado = arguments?.getDouble("resultado")!!

        if (resultado > 0){
            tv_resultado.text = "Você ainda tem grana!"
            iv_resultado.setImageDrawable(activity?.getDrawable(R.drawable.woman_happy_money))
        }
        else{
            tv_resultado.text = "Você está na pindaíba"
            iv_resultado.setImageDrawable(activity?.getDrawable(R.drawable.woman_sad))
        }

    }


}
