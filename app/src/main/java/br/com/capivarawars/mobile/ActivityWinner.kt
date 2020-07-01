package br.com.capivarawars.mobile

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityWinner : AppCompatActivity() {

    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner)
        preferences = getPreferences(Context.MODE_PRIVATE)
    }

    fun buttonFinishMatch(view: View) {
        val activityHome = Intent(this, ActivityHome::class.java)
        startActivity(activityHome)
    }

    override fun onBackPressed() {
        val gender = "" + preferences.getString("gender", "")
        val genderTitle = if(gender == "m") "MAN" else if (gender == "f") "GIRL" else "ROBOT"
        val mensagem = "Now you can play again!\n Fight!\n  Fight!\n   Fight like a $genderTitle!!! :)"
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

}