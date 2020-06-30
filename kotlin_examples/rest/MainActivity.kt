package com.example.consumorest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buscarEndereco(v: View){
        val cepPesquisa = et_cep.text.toString()
        val cep = GetCepTask().execute(cepPesquisa).get()
        val endereco = "Endereço: ${cep.logradouro}, ${cep.bairro} - ${cep.localidade}"
        tv_endereco.text = endereco
    }

}
