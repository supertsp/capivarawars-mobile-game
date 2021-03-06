package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityRegistrationPass03 : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass03)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonBack(view: View) {
        val activityRegistrationPass02 = Intent(this, ActivityRegistrationPass02::class.java)
        startActivity(activityRegistrationPass02)
    }

    fun buttonSaveRegister(view: View) {
        val activityHome = Intent(this, ActivityHome::class.java)
        startActivity(activityHome)

//        val activityLoading = Intent(this, ActivityLoading::class.java)
//        startActivity(activityLoading)
    }
}
