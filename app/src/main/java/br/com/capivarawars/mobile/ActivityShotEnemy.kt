package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityShotEnemy : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shot_enemy)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonShotEnemy(view: View) {
        val activityTurnStatus = Intent(this, ActivityTurnStatus::class.java)
        startActivity(activityTurnStatus)
    }

    override fun onBackPressed() {
        val gender = "" + preferences.getString("gender", "")
        val genderTitle = if(gender == "m") "MAN" else if (gender == "f") "GIRL" else "ROBOT"
        val mensagem = "You can't return anymore!\n Shot like a $genderTitle!!! :O"
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

}