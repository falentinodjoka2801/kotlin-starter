package com.kotlin.starter

fun main(){
    val sum     =   sumNumbers(10, 5, 10, 7, 2, 6, 1)
    println("sum : $sum")

    val listOfString: List<String>  =   asList<String>("Falentino", "Oasis", "Tino", "Djoka", "Muhammad")
    println("listOfString")
    println(listOfString)

    val listOfInt: List<Int>    =   asList<Int>(28, 2000, 10, 54)
    println("listOfInt")
    println(listOfInt)

    val listNumbers: IntArray =   intArrayOf(5, -1, 4)
    val jumlahPerhitungan   =   jumlah(*listNumbers)
    println("jumlahPerhitungan")
    println(jumlahPerhitungan)
}

//General vararg
fun sumNumbers(vararg numbers: Int): Int{
    return numbers.sum()
}

//Generic Vararg
fun <T> asList(vararg input: T): List<T>{
    val result  =   ArrayList<T>()
    for(item in input){
        result.add(item)
    }

    return result
}

//array parameter as vararg
fun jumlah(vararg angka: Int): Int{
    return angka.sum()
}