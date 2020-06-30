package com.example.appfragmento

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        bt_resultado.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.frame01, Fragmento01()).commit()
//        }
    }

    fun mostrarFragmento01(v: View) {
        val gastou = ("0" + et_gastou.text.toString()).toDouble()
        val guardou = ("0" + et_guardou.text.toString()).toDouble()
        val resultado = guardou - gastou

        val parametros = Bundle()
        parametros.putDouble("resultado", resultado)
        val fragmento01 = Fragmento01()
        fragmento01.arguments = parametros
        supportFragmentManager.beginTransaction().replace(R.id.frame01, fragmento01).commit()
    }

    fun mostrarFragmento02(v: View) {
        val parametros = Bundle()
        parametros.putString("bairro", "Saúde")
        parametros.putInt("habitantes", 20000)

        val fragmento02 = Fragmento02()
        fragmento02.arguments = parametros

        supportFragmentManager.beginTransaction().replace(R.id.frame01, fragmento02).commit()
    }
}
