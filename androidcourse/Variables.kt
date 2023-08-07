package com.juanbermudezg.androidcourse

val numberDoubleExample: Double = 3.141623 //Funcion de clase

//variables
fun main() {
    showMyName("Juan Andres")
    showMyAge(19)
    add(25, 156)
    val mySubstract=subtract(100, 8)
    println(mySubstract)
}

fun showMyName(name: String) {
    println("Me llamo $name")
}

fun showMyAge(currentAge: Int = 30) {//puede colocarle valores default
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber

fun variablesAlfanumericas() {
    //Alfanumerical

    val charExample1: Char = 'a'
    val charExample2: Char = '3'
    val charExample3: Char = '@'
    val stringExample = "Android"
    val stringExample2: String = "Android"
    println(stringExample)
    println("Concatenar: ")
    println(stringExample + stringExample)
    var stringConcatenada: String = "Hola"
    println(stringConcatenada)
    stringConcatenada = "Salut je m'apelle " + stringExample
    println(stringConcatenada)
    stringConcatenada = "Salut je m'apelle $stringExample et j'ai $numberDoubleExample ans"
    println(stringConcatenada)
}

fun variablesBoolean() {
    //Boolean

    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}

fun variablesNumericas() {

    // Numerical
    val numberIntExample: Int = 30
    var numberIntExample2: Int = 30
    numberIntExample2 = 29
    val numberLongExample: Long = 20
    val numberFloatExample: Float = 3.1416f

    //Funciones aritmeticas
    println("Sumar: ")
    println(numberIntExample + numberIntExample2)

    println("Restar: ")
    println(numberIntExample - numberIntExample2)

    println("Multiplicar: ")
    println(numberIntExample * numberIntExample2)

    println("Dividir: ")
    println(numberIntExample / numberIntExample2)

    println("Módulo: ")
    println(numberIntExample % numberIntExample2)

    println("Sumar: ")
    println(numberIntExample + numberFloatExample.toInt())

}