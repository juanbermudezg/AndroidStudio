package com.juanbermudezg.androidcourse

fun main() {
    println(getMonth(8))
}

fun getMonth(month: Int): String {
    var monthName: String
    when (month) {
        1 -> monthName = "January"
        2 -> monthName = "February"
        3 -> monthName = "March"
        4 -> monthName = "April"
        5 -> monthName = "May"
        6 -> monthName = "June"
        7 -> monthName = "July"
        8 -> {
            monthName = "August"
            println("The best month BTW")
        }

        9 -> monthName = "September"
        10 -> monthName = "October"
        11 -> monthName = "November"
        12 -> monthName = "December"
        else -> monthName = "Invalid month"
    }
    return monthName
}

fun getTrimester(month: Int): String {
    var trimesterNum: String
    when (month) {
        1, 2, 3 -> trimesterNum = "First trimester"
        4, 5, 6 -> trimesterNum = "Second trimester"
        7, 8, 9 -> trimesterNum = "Third trimester"
        10, 11, 12 -> trimesterNum = "Fourth trimester"
        else -> trimesterNum = "Invalid trimester"
    }
    return trimesterNum
}

fun getSemester(month: Int) = when (month) {
    in 1..6 -> "First semester"
    in 7..12 -> "Second semester"
    !in 1..12 -> "Invalid semester"
    else -> "XD"
}

fun resultado(value: Any) {
    when (value) {
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if (value) print("Hurra")
    }
}