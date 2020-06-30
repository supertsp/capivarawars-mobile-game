package com.example.switchoriginsscrooll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var totalGasto = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw_campo2.setOnCheckedChangeListener { componente,  ligado ->
            chavearLiberacao(componente)
        }

    }

    fun chavearLiberacao(v: View){
        et_campo1.isEnabled = sw_campo2.isChecked;
    }

    fun comprar(v: View){
        val valorItem = when(v.id){
            R.id.bt_casquinha -> 1.5
            R.id.bt_coxinha -> 1.9
            R.id.bt_coca -> 3.5
            else -> 0.0
        }

        totalGasto += valorItem
        tv_totalgasto.text = "Total Gasto: R$ " + totalGasto

    }

}
