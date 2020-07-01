package br.com.capivarawars.mobile

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import br.com.capivarawars.mobile.rest.PlayerRestConfig

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonLogin(v: View) {
        tv_result.text = "Loading content..."

        // Contexts: IO (network, disk), Main (UI), Default (heavy actions like filters operation)
        CoroutineScope(Dispatchers.Main).launch {
            getPlayersList()
        }
    }

    private suspend fun getPlayersList() {
//        withContext(Dispatchers.Main){
        tv_result.text = PlayerRestConfig.consult().getPlayer(2).fullName
//        }
    }

}
