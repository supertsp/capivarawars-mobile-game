package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun buttonBack(v: View){
        val activityMain = Intent(this, ActivityMain::class.java)
        startActivity(activityMain)
    }

    fun buttonLogin(v: View){
        val activityHome = Intent(this, ActivityHome::class.java)
        startActivity(activityHome)
    }

    fun buttonCreateAccount(v: View){
        val activityRegistrationPass01 = Intent(this, ActivityRegistrationPass01::class.java)
        startActivity(activityRegistrationPass01)
    }

}