package lesson3

fun main() {
    val afternoonMsg = "Добрый день"
    val eveningMsg = "Добрый вечер"
    val userName = "Дмитрий"

    var helloBoxMsg = ("$afternoonMsg $userName")

    println(helloBoxMsg)

    helloBoxMsg = ("$eveningMsg $userName")

    println(helloBoxMsg)

}