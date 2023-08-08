package com.juanbermudezg.androidcourse.syntaxis

fun main() {
    var name: String = "juanbermudezg"

    val weekDays = arrayOf("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche")

    //println(weekDays[0])
    //println(weekDays.size)
    /*
    if (weekDays.size >= 8) {
        println(weekDays[7])
    } else {
        println("No hay más valores en el array")
    }
    */

    //weekDays[0] = "lundi"

    //println(weekDays[0])

    //Bucles para arrays

    for(position in weekDays.indices){
        //println(weekDays[position])
    }
    for((position, value) in weekDays.withIndex()){
       // println("La posición $position, contiene $value")
    }
    for (weekDay in weekDays){
        println("Aujourd'hui c'est $weekDay")
    }
}