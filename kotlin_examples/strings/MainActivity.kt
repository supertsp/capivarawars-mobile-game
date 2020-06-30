package com.example.apppoliglota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chave_nome = getString(R.string.chave_nome_usuario)
        val chave_idade = getString(R.string.chave_idade_usuario)
    }
}
