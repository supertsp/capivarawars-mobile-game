package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonLogin(v: View) {
        val activityLogin = Intent(this, ActivityLogin::class.java)
        startActivity(activityLogin)
    }

    fun buttonGeneralTerms(v: View){
        val activityGeneralTerms = Intent(this, ActivityGeneralTerms::class.java)
        startActivity(activityGeneralTerms)
    }


}
