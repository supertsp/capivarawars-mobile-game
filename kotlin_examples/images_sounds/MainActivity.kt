package com.example.happypet

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var catSoundSad: MediaPlayer? = null
    var catSoundHappy: MediaPlayer? = null
    var contAgrado = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        catSoundSad = MediaPlayer.create(this, R.raw.petting_cat)
        catSoundHappy = MediaPlayer.create(this, R.raw.happy_cat)
    }

    fun onClick_agradar(v: View){
        contAgrado--

        if (contAgrado <= 0){
            iv_cat.setImageDrawable(getDrawable(R.drawable.happy_sad_cat_02))
            tv_agrado_left.setText("")
            tv_agrado.setText("")
            tv_agrado_right.setText("")
            catSoundHappy?.start()
        }
        else{
            tv_agrado_left.setText("Faltam ")
            tv_agrado.setText(contAgrado.toString())
            tv_agrado_right.setText(" agradinhos")
            catSoundSad?.start()
        }
    }

    fun onClick_restaurar(v: View){
        contAgrado = 7
        iv_cat.setImageDrawable(getDrawable(R.drawable.happy_sad_cat_01))
        tv_agrado_left.setText("Faltam ")
        tv_agrado.setText(contAgrado.toString())
        tv_agrado_right.setText(" agradinhos")
    }

}
