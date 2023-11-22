package lesson7

fun main() {

    var password = ""

    for (i in 0..2) {
        val randomLetter = ('a'..'z').random().toString()
        val randomNumber = (0..9).random().toString()

        password += randomLetter + randomNumber

    }
    println(password)
}
