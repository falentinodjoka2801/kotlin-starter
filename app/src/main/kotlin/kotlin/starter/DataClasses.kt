package kotlin.starter

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int)

fun main(){
    val user        =   User("Rahman", 17)
    val dataUser    =   DataUser("Rahman", 23)

    println(user)
    println(dataUser)
}