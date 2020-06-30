package com.example.nivelamentokotlin

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testeTipoKotlin() {

        val idade = "39"
        val idadeNum = idade.toIntOrNull()
        val idadeReal = idade.toDouble()

        val flutuante = 10.5f


    }

    @Test
    fun testeStringKotlin() {
        println("é nois no kotlin")

        val pais = "Canadá"
        val continente = "América do Norte"
        println("O país $pais fica no continete $continente")
        println("Minha média foi ${(8.5 + 7.9f + 20) / 3}")

        //multiline String
        val instrucao = """
            select * from tabela
                where campo = ${pais}
            order by id desc
        """.trimIndent()
        println(instrucao)
    }


    @Test
    fun testeMutaveisImutaveisKotlin() {
        //Imutáveis
        val endereco = "xzy"
        //uma vez atribuído vira imutável (constante)
        //endereco = "abc"

        //Mutáveis
        var contador = 0
        contador++
    }

    @Test
    fun testesFuncoes() {
        val salario = 2000.0
        val ir = calcularIr(salario)
        println("O desc. de IR será de $ir")
    }

    fun calcularInss(salario: Double) {
        val inss = salario * 0.1
        println("INSS de ${salario} será ${inss}")
    }

    fun calcularIr(salario: Double): Double {
        var ir = salario * 0.2
        return ir
    }

    @Test
    fun testVetoresListas() {

        //Arrays
        val vetorFrutas = arrayOf("pêra", "maçã", "uva", "Morango")
        val vetorFrutas2: Array<String> = arrayOf("pêra", "maçã", "uva")
        val vetorAny = arrayOf("casa", 10, false)

        //Listas
        val listaBairros = mutableListOf("Luz", "São Matheus", "Saúde", "Sé")
        val listaBairros2: List<String> = mutableListOf("saúde", "sé")

        //add
        listaBairros.add("cidade tiradentes")
        listaBairros.addAll(listaBairros2)
        println(listaBairros)

        //replace
        listaBairros[0] = "Santo Antonio"
        listaBairros.set(1, "São Roque")

        //remove
        listaBairros.remove("saúde")
        listaBairros.removeAt(0)

        //lista imutável
        val listaPaises = listOf("Canadá", "Austrália", "Japão")
        //listaPaises.add("USA") //não permitido
        //listaPaises[0] = "USA"

        //iterando listas
        vetorFrutas.forEach {
            println("Fruta: $it")
        }

        //iterando listas alterando nome variárvel
        vetorFrutas.forEach { value ->
            println("Fruta: $value")
        }

        //iterando com nome da variável e índice
        listaBairros.forEachIndexed { indice, bairro ->
            println("Bairro: ${indice}: ${bairro}")
        }

        //filtrar vetor ou lista
        val filtrada = vetorFrutas.filter { it.contains(Regex("[mM]")) }
        println("Filtrada: $filtrada")

        //ordenação
        listaBairros.sortBy { it.length }
        println("Ordem por tameanho: $listaBairros")

        //ordenação inversa
        listaBairros.sortByDescending { it.length }
        println("Ordem por tameanho inverso: $listaBairros")

        //métodos úteis
        println("Primeira Fruta: ${vetorFrutas.first()}")
        println("Primeira Fruta: ${vetorFrutas.last()}")

    }

    @Test
    fun tratamentoDeNulos() {
        //val cidade: String = null //não aceita null direto

        var cidade: String = "Belém"
        //cidade = null //não aceita null

        //forçando atribuição de null
        var telefoneComercial: String? = null

        //Criando uma var que pode ser null
        var paisDosSonhos: String? = null
        //executar método somente se não null
        val maiusculo = paisDosSonhos?.toUpperCase() //?.método -> Safe Navigator
        println("maiúsculo: $maiusculo")

        //forçando KotlinNullPointerException
        paisDosSonhos!!.toUpperCase()

    }


}
