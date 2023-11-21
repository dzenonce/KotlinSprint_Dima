package lesson6

fun main() {
    println("Введите количество секунд для паузы: ")
    var userSecond = readln().toInt()

    while (userSecond > 0) {
        println("Осталось секунд: ${userSecond--}")
        Thread.sleep(1000)
    }

    println("Время вышло!")
}