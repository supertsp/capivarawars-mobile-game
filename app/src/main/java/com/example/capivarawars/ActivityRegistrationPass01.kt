package com.example.capivarawars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityRegistrationPass01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass01)
    }

    fun onClick_backToMain(v: View) {
        super.onBackPressed()
    }

    fun onClick_nextToPass02(v: View) {
        val activityRegistrationPass02 = Intent(this, ActivityRegistrationPass02::class.java)
        startActivity(activityRegistrationPass02)
    }

}
