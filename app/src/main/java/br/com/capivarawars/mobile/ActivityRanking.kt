package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityRanking : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonBackToHome(view: View) {
        val activityHome = Intent(this, ActivityHome::class.java)
        startActivity(activityHome)
    }
}