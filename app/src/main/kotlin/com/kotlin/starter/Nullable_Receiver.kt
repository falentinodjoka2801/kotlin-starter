package com.kotlin.starter

val Int?.isGenap: Boolean?
    get(){
        if(this == null){
            return null
        }

        return this % 2 == 0
    }

val Int?.isGanjil: Boolean?
    get(){
        return this?.isGenap == false
    }

fun main(){
    val usia: Int?  =   null

    println("usia.isGenap")
    println(if(usia == null) null else usia.isGanjil)
    println(usia?.isGanjil)
}