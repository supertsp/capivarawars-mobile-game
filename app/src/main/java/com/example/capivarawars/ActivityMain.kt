package com.example.capivarawars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick_signin(v: View) {
        val activityRegistrationPass01 = Intent(this, ActivityRegistrationPass01::class.java)
        startActivity(activityRegistrationPass01)
    }
}
