package lesson7

fun main() {
    println("Сколько секунд необходимо засечь? ")
    val userTimeInput = readln().toInt()

    for (remainingTime in userTimeInput downTo 1) {
        println("До конца таймера осталось: $remainingTime")
        Thread.sleep(1000)

        if (remainingTime == 1) println("Время вышло!")
    }
}