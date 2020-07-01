package br.com.capivarawars.mobile.helper

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

object OfflineData {

    private var instaceOfSharedPreferences: SharedPreferences? = null

    fun getConnection(activity: Activity): SharedPreferences? {
        if (instaceOfSharedPreferences == null) {
            instaceOfSharedPreferences =
                activity.applicationContext.getSharedPreferences("prefs", Context.MODE_PRIVATE)
        }
        return instaceOfSharedPreferences
    }

}
