package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.capivarawars.mobile.helper.OfflineData
import br.com.capivarawars.mobile.rest.PlayerRestConfig
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.coroutines.*

class ActivityLogin : AppCompatActivity() {

//    lateinit var preferences: SharedPreferences

    var idPlayer = 0L
    var nick = ""
    var gender = ""
    var score = 0
    var capybaraName = ""
    var capybaraColor = ""
    var capybaraLife = 0
    var accountBirthday = ""
    var wins = 0
    var losses = 0
    var draws = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        preferences = getPreferences(Context.MODE_PRIVATE)

    }

    fun buttonBack(v: View) {
        val activityMain = Intent(this, ActivityMain::class.java)
        startActivity(activityMain)
    }

    fun buttonLogin(v: View) {
        nick = ("" + et_nick.text).trim()
        val password = ("" + et_password.text).trim()

        if (nick == "" || password == "") {
            val mensagem = "Please fill the Login fields ;)"
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
        } else {
            CoroutineScope(Dispatchers.IO).launch {
                checkLogin(nick, password)
            }
        }
    }

    fun buttonCreateAccount(v: View) {
        val activityRegistrationPass01 = Intent(this, ActivityRegistrationPass01::class.java)
        startActivity(activityRegistrationPass01)
    }

    private suspend fun checkLogin(nick: String, password: String) {
        val credentialsOk = GlobalScope.async {
            PlayerRestConfig.consult().checkCredentials(nick, password)
        }

        if (credentialsOk.await()) {
            var response = GlobalScope.async {
                PlayerRestConfig.consult().getPlayerByNick(nick)
            }

            if (response.await() != null) {
                PlayerRestConfig.consult().updatePlayerOnline(response.await().idPlayer, true)

                val player = response.await();

                idPlayer = player.idPlayer
                this.nick = player.nick
                gender = player.gender.toString()
                score = player.score
                capybaraName = player.capybaraName
                capybaraColor = player.capybaraColor
                capybaraLife = player.capybaraLife
                accountBirthday = player.accountBirthday
                wins = player.wins
                losses = player.losses
                draws = player.draws

                savePlayerData()

                val activityHome = Intent(this, ActivityHome::class.java)
                startActivity(activityHome)
            }
        }

//        tv_login_error.text = ""
        var message = "Please check that your credentials is correct."
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private suspend fun showMessage(message: String) {
        withContext(Dispatchers.Main) {
            tv_newtocapivara.text = message
        }
    }

    private suspend fun savePlayerData() {
        val editor = OfflineData.getConnection(this)?.edit()

        editor?.putLong("idPlayer", idPlayer)
        editor?.putString("nick", nick)
        editor?.putString("gender", gender)
        editor?.putInt("score", score)
        editor?.putString("capybaraName", capybaraName)
        editor?.putString("capybaraColor", capybaraColor)
        editor?.putInt("capybaraLife", capybaraLife)
        editor?.putString("accountBirthday", accountBirthday)
        editor?.putInt("wins", wins)
        editor?.putInt("losses", losses)
        editor?.putInt("draws", draws)

        editor?.commit()
    }

}