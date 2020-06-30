package com.example.nivelamentokotlin

class Conta {

    var nomeTitular: String = "x"
        set(value) {
            if (value != "" && value.length > 2) {
                field = value
            }
        }

    var email: String = ""
    get() = field.toUpperCase()

    var saldo: Double = 0.0
    set(value){
        if (value >= 0.0){
            field = value
            contadorTransacoes++
        }
    }

    private var contadorTransacoes: Int = 0
    //      get() = field
    // nesse caso deverá ser implementado manualmente

    override fun toString(): String {
        return """
            nomeTitular: $nomeTitular
            email: $email
            saldo: $saldo            
        """.trimIndent()
    }
}