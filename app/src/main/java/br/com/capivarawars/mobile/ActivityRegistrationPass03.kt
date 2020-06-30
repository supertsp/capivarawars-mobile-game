package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

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
