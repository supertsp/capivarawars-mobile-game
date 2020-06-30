package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityRegistrationPass01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass01)
    }

    fun buttonBack(v: View) {
        val activityLogin = Intent(this, ActivityLogin::class.java)
        startActivity(activityLogin)
    }

    fun onClick_nextToPass02(v: View) {
        val activityRegistrationPass02 = Intent(this, ActivityRegistrationPass02::class.java)
        startActivity(activityRegistrationPass02)
    }

}
