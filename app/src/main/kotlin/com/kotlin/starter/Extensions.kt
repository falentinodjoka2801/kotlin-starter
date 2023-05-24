package com.kotlin.starter

//Extension Functions. Receiver Type : Int
fun Int.printInt(){
    println("value $this")
}
fun Int.sayThanksForPay(): String {
    return "Hey, thank you for paying $$this"
}

//Extension Properties
val Int.isGenap: Boolean
    get()   =   this % 2 == 0

fun main(){
    2801.printInt()
    println(500.sayThanksForPay())
    val apakahIniBilanganGenap: Boolean =   28.isGenap
    println("apakahIniBilanganGenap : $apakahIniBilanganGenap")
}