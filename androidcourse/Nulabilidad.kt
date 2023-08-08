package com.juanbermudezg.androidcourse

fun main(){
    var name:String? =null
    //println(name!![0])
    println(name?.get(0))
    println(name?.get(0) ?: "Es nulo weon")
}