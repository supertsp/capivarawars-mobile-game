package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityRegistrationPass02 : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass02)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonBack(v: View) {
        val activityRegistrationPass01 = Intent(this, ActivityRegistrationPass01::class.java)
        startActivity(activityRegistrationPass01)
    }

    fun buttonNextStep(v: View) {
        val activityRegistrationPass03 = Intent(this, ActivityRegistrationPass03::class.java)
        startActivity(activityRegistrationPass03)
    }

    fun buttonGeneralTerms(view: View) {
        val activityGeneralTerms = Intent(this, ActivityGeneralTerms::class.java)
        startActivity(activityGeneralTerms)
    }
}
