package com.example.consumorest

import feign.Feign
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder

object ClientViaCep {

    fun criar(): CepRequests {
        return Feign.builder()
            .decoder(GsonDecoder())
            .encoder(GsonEncoder())
            .target(CepRequests::class.java, "https://viacep.com.br/")
    }

}