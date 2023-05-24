package com.kotlin.starter

typealias Aritmatika = (Int, Int) -> Int
typealias AritmatikaNullable    =   ((Int, Int) -> Int)?

val perkalian: Aritmatika   =   {a, b -> a * b}
//val pembagian: Aritmatika   =   {a, b -> a / b}
//val penjumlahan: Aritmatika =   {a, b -> a + b}
//val pengurangan: Aritmatika =   {a, b -> a - b}

val perkalianNullable: AritmatikaNullable   =   {a, b -> a * b}

fun main(){
    val hasilPerkalian: Int =   perkalian.invoke(10, 3)
    println("hasilPerkalian : $hasilPerkalian")

    val hasilPerkalianNullable: Int?    =   perkalianNullable?.invoke(10, 25)
    println("hasilPerkalianNullable : $hasilPerkalianNullable")
}