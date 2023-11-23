package lesson7

fun main() {

    val randomLetter = 'a'..'z'
    val randomNumber = 0..9

    var password = ""

    for (i in 0..2) {
        password += randomLetter.random().toString() + randomNumber.random().toString()
    }
    println(password)
}
