package com.example.capivarawars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityRegistrationPass03 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_pass03)
    }

    fun onClick_backToPass02(view: View) {
        super.onBackPressed()
    }

    fun onClick_nextToHome(view: View) {
        val activityHome = Intent(this, ActivityHome::class.java)
        startActivity(activityHome)
    }
}
