package com.example.appfragmento


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_fragmento02.*

/**
 * A simple [Fragment] subclass.
 */
class Fragmento02 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento02, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val bairro = arguments?.get("bairro")
        val habitantes = arguments?.get("habitantes")
        val texto = "Bairro: ${bairro}, ondem moram ${habitantes} pessoas"
        tv_fragmento02.text = texto
    }


}
