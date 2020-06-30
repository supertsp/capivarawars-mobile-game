package com.example.consumorest

import feign.Param
import feign.RequestLine

interface CepRequests {

    @RequestLine("GET /ws/{cep}/json")
    fun getCep(@Param("cep") cep: String): Cep

}