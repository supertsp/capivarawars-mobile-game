package br.com.capivarawars.mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityRegistrationPass02 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass02)
    }

    fun onClick_backToPass01(v: View) {
        super.onBackPressed()
    }

    fun onClick_nextToPass03(v: View) {
        val activityRegistrationPass03 = Intent(this, ActivityRegistrationPass03::class.java)
        startActivity(activityRegistrationPass03)
    }
}
