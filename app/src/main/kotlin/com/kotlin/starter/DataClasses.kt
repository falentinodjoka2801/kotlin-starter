package com.kotlin.starter

class User(val name: String, val age: Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)";
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
    //val user        =   User("Rahman", 17)
    //val dataUser    =   DataUser("Rahman", 23)

    //println(user)
    //println(dataUser)
}