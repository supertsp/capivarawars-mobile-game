package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.capivarawars.mobile.helper.OfflineData


class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonLogin(v: View) {
        val currentUserNick = "" + OfflineData.getConnection(this)?.getString("nick", "")
        if (currentUserNick != ""){
            val activityHome = Intent(this, ActivityHome::class.java)
            startActivity(activityHome)
        }
        else{
            val activityLogin = Intent(this, ActivityLogin::class.java)
            startActivity(activityLogin)
        }

    }

    fun buttonGeneralTerms(v: View){
        val activityGeneralTerms = Intent(this, ActivityGeneralTerms::class.java)
        startActivity(activityGeneralTerms)
    }


}
