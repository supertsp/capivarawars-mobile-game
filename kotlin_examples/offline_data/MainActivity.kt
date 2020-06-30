package com.example.dadosoffline

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var preferencias: SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        preferencias = getPreferences(Context.MODE_PRIVATE)

        val nomeUsuario = preferencias?.getString("nomeUsuario", "")
        val idadeUsuario = preferencias?.getInt("idadeUsuario", -1)

        et_nome.setText(nomeUsuario)

        if (idadeUsuario!! > -1){
            et_idade.setText(idadeUsuario.toString())
        }
    }

    fun gravar(V: View) {
        val nomeUsuario =  et_nome.text.toString()
        val idadeUsuario = et_idade.text.toString().toInt()

        val editor = preferencias?.edit()

        editor?.putString("nomeUsuario", nomeUsuario)
        editor?.putInt("idadeUsuario", idadeUsuario)

        editor?.commit()
    }
}
