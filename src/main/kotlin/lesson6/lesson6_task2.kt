package lesson6

fun main() {

    println("Поставьте программу на паузу, введите количество секунд: ")
    val userSecond = readln().toLong()

    Thread.sleep(userSecond * ONE_SEC_IN_MILLISEC)
    println("Прошло $userSecond секунд")
}

const val ONE_SEC_IN_MILLISEC = 1000L