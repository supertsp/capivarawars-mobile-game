package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import br.com.capivarawars.mobile.helper.OfflineData
import kotlinx.android.synthetic.main.activity_home.*
import java.time.LocalDateTime

class ActivityHome : AppCompatActivity() {

    var gender = ""

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        editor?.putLong("idPlayer", idPlayer)
////        editor?.putString("nick", nick)
////        editor?.putInt("score", score)
////        editor?.putString("capybaraName", capybaraName)
////        editor?.putString("capybaraColor", capybaraColor)
////        editor?.putInt("capybaraLife", capybaraLife)
////        editor?.putString("accountBirthday", accountBirthday)
////        editor?.putInt("wins", wins)
////        editor?.putInt("losses", losses)
////        editor?.putInt("draws", draws)

        gender = "" + OfflineData.getConnection(this)?.getString("gender", "")

        if (gender == "M"){
            iv_icon_player.setImageDrawable(getDrawable(R.drawable.user_male_icon))
        }
        else{
            iv_icon_player.setImageDrawable(getDrawable(R.drawable.user_female_icon))
        }

        tv_nick_player.text = "" + OfflineData.getConnection(this)?.getString("nick", "")
        tv_player_score.text = "" + OfflineData.getConnection(this)?.getInt("score", 0)

        val capybaraColor = "" + OfflineData.getConnection(this)?.getString("capybaraColor", "")
        when (capybaraColor){
            "black" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_black))
            "blue" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_blue))
            "brown" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_brown))
            "green" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_green))
            "pink" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_pink))
            "purple" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_purple))
            "red" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_red))
            "redEnemy" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_red_enemy))
            "white" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_white))
            "yellow" -> iv_capybara_icon.setImageDrawable(getDrawable(R.drawable.capii_player_yellow))
        }

        val accountBirthday = "" + OfflineData.getConnection(this)?.getString("accountBirthday", "")
        val dateOfCreationAccount = LocalDateTime.parse(accountBirthday)
        val currentDate = LocalDateTime.now()
        val dateResult = currentDate.minusYears(dateOfCreationAccount.year.toLong())
        val months = String.format("%.1f", (currentDate.monthValue - dateOfCreationAccount.monthValue) / 12.0).substring(2)
        tv_capybara_age.text = "" + dateResult.year + "." + months + " years old"

        tv_capybara_name.text = "" + OfflineData.getConnection(this)?.getString("capybaraName", "")
        tv_player_wins.text = "" + OfflineData.getConnection(this)?.getInt("wins", 0)
        tv_player_losses.text = "" + OfflineData.getConnection(this)?.getInt("losses", 0)
        tv_player_draws.text = "" + OfflineData.getConnection(this)?.getInt("draws", 0)

        val capybaraLife = "" + OfflineData.getConnection(this)?.getInt("capybaraLife", 0)
        fillCapybaraLife(capybaraLife.toInt())


    }

    fun buttonFight(view: View) {
        val activityMoveBoat = Intent(this, ActivityMoveBoat::class.java)
        startActivity(activityMoveBoat)
    }

    fun buttonRanking(view: View) {
        val activityRanking = Intent(this, ActivityRanking::class.java)
        startActivity(activityRanking)
    }

    override fun onBackPressed() {

        val genderTitle = if(gender == "m") "MAN" else if (gender == "f") "GIRL" else "ROBOT"
        val mensagem = "Fight like a $genderTitle!!!\n Choose your Destiny :D"
        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show()
    }

    fun fillCapybaraLife(life: Int){
        val capybaraLife = arrayOf(
            iv_life_square_00,
            iv_life_square_01,
            iv_life_square_02,
            iv_life_square_03,
            iv_life_square_04,
            iv_life_square_05,
            iv_life_square_06
        )

        for (index in capybaraLife.indices){
            if (index <= life){
                capybaraLife[index].setImageDrawable(getDrawable(R.drawable.life_square_fill))
            }
            else{
                capybaraLife[index].setImageDrawable(getDrawable(R.drawable.life_square_empty))
            }
        }
    }

}
