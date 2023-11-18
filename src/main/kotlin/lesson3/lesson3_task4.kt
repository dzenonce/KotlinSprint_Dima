package lesson3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveNumber = 1

    val stringToSend = "$moveFrom-$moveTo;$moveNumber"

    println(stringToSend)

    moveFrom = "D2"
    moveTo = "D3"
    moveNumber = 2

    println("$moveFrom-$moveTo;$moveNumber")
}