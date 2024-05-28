package pe.edu.idat.appdemo

import android.util.Log

class Fundamentos {

    var nombres = "Kenshin"
    var apellidos = "H."
    var edad : Int = 23
    var sexo = "Masculino"
    var estadoCivil = "Soltero"
    var altura : Double = 1.75
    var activo : Boolean = true

    fun ejemplosLambda() {
        val numeros = arrayListOf(9, 10, 30, 40, 5)
        val numerosPares = numeros.filter { n -> n % 2 == 0 }

        val miFuncionMultiplicacion = fun(n1: Int, n2: Int): Int {
            return n1 * n2
        }

        // Aquí puedes usar o imprimir los resultados si lo deseas
        println("Números pares: $numerosPares")
        println("Multiplicación de 5 y 10: ${miFuncionMultiplicacion(5, 10)}")
    }

    private fun operaciones(x:Int, z:Int, funcion:(Int, Int) -> Int):Int {


    }


    fun dowhile(){
        var contador = 10
        while (contador > 1){

        }
        do{

        }while(contador>3)

    }

    fun bucleFor(){
        val notas = intArrayOf(13,20,4,6,8,10)
        for(nota: Int in notas){
            imprimir(nota.toString())
        }
        for((indice, valor) in notas.withIndex()){
            imprimir("Nota $indice es igual $valor")
        }
        for(numero in 5..10){
            imprimir("Numero $numero")
        }

        fun arreglosKotlin(){
            val arrayNumeros: IntArray = intArrayOf(12,12,5)
            val paises = ArrayList<String>()
            paises.add("peru")
            paises.add("argentina")
            paises.add("chile")
        }

        fun imprimir(mensaje:String) {
            Log.i("imprimir",mensaje)
        }
        fun operaciones (numero1: Int, numero2: Int,
                         operacion: String) : String {
            return "Resultado final"
        }

    }


