package com.example.nivelamentokotlin

import org.junit.Test

class TestesKotlinPoo {

    @Test
    fun testesConta1() {

        val contaX = Conta()
        contaX.nomeTitular = "xxx"
        contaX.email = "diva@GMAIL.com"
        contaX.saldo = 2000.0

        //contaX.contadorTrasacao = 2

        println(contaX)
//        println(contaX.contadorTrasacao)


    }


    @Test
    fun testesJogador1() {

        val jogadorA = Jogador("Zé Budia", 1.7, "Íbis")
        jogadorA.nome = "Nino"

        println(jogadorA.nome)

    }

    @Test
    fun testesAluno1(){

        val aluno = Aluno("Igor", "ADS")
//        val aluno = Aluno()
        println(aluno.nome)
        println(aluno.curso)

    }

}