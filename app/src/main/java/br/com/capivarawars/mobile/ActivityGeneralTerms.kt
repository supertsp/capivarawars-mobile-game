package br.com.capivarawars.mobile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityGeneralTerms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_terms)
    }

    fun buttonBack(v: View){
        super.onBackPressed()
    }

}