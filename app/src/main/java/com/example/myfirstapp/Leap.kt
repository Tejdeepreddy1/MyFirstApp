package com.example.myfirstapp

fun main() {
    val year : Int = 2004
    if(checkLeapYear(year)) {
        println("given year $year is a leap year")
    }
    else {
        println("given year $year is not a leap year")
    }
}
private fun checkLeapYear(year: Int ) : Boolean {
    return ((year % 400)==0) || (((year % 4 )==0)) && ((year %100) != 0)
}