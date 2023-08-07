package com.juanbermudezg.androidcourse

fun main() {
    //ifBase("Juan Andres ")
    //ifAnidado()
    //ifBoolean()
    //ifInt()
    //ifMultiple()
    ifMultipleOr()
}

fun ifMultipleOr(){
    var pet:String = "dog"
    if (pet=="dog" || pet=="cat"){
        println("You have got a pet")
    }
}

fun ifMultiple() {
    var age: Int = 18
    var permissionParents: Boolean = false
    var estadoAnimo: Boolean = true
    /*
    if(age>=18){
        if(permissionParents){
            println("You r ready to drink")
        }
    }
    */
    if(age>=18 && permissionParents && estadoAnimo){
        println("Your r ready to drink")
    }else{
        println("Sorry dude :c")
    }
}

fun ifInt() {
    var age: Int = 19
    if (age >= 18) {
        println("Lets take a beer")
    } else {
        println("Lets take a yougurt")
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = false
    if (soyFeliz) {
        println("Buy ice cream")
    } else {
        println("Buy even more ice cream")
    }
}

fun ifAnidado() {
    val animal = "plane"
    if (animal == "cat") {
        println("Meow")
    } else if (animal == "dog") {
        println("Wof")
    } else {
        println("Es una criatura extraterrestre")
    }
}

fun ifBase(name: String) {
    if (name.lowercase() == "juan andres") {
        println("Oye, el acceso es correcto")
    } else {
        println("Sorry but not sorry")
    }
}