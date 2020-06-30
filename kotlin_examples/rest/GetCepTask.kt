package com.example.consumorest

import android.os.AsyncTask

class GetCepTask : AsyncTask<String, Void, Cep>() {
    override fun doInBackground(vararg params: String?): Cep {
        return ClientViaCep.criar().getCep(params[0]!!)
    }
}
