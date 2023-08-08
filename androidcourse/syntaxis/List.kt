package com.juanbermudezg.androidcourse.syntaxis

fun main() {
    //inmutableList()
    mutableList()
}

fun mutableList() {
    val weekDays: MutableList<String> =
        mutableListOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")
    weekDays.add("JuanJour") // weekDays.add(0, "JuanJour") para colocarlo en un indice especifico
    println(weekDays)

    if (weekDays.isEmpty()) {
        //No imprimir
    } else {
        //weekDays.forEach { println(it) }
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { println(it) }
    }

}

fun inmutableList() {
    val readOnly: List<String> =
        listOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")
    //println(readOnly.size)
    //println(readOnly) //println(readOnly.toString)
    //println(readOnly.last())
    //println(readOnly.first())

    //Filtrar
    /*
    val example = readOnly.filter { it.contains("a") }
    println(example)
    */
    readOnly.forEach { weekDay -> println(weekDay) }
}