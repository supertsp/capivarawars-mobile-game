package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityRegistrationPass01 : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass01)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonBack(v: View) {
        val activityLogin = Intent(this, ActivityLogin::class.java)
        startActivity(activityLogin)
    }

    fun buttonNextStep(v: View) {
        val activityRegistrationPass02 = Intent(this, ActivityRegistrationPass02::class.java)
        startActivity(activityRegistrationPass02)
    }

}
