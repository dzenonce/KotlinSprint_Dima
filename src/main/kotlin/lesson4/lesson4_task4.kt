package lesson4

fun main() {
    val trainingDayNumber = 5

    val isEvenDay = trainingDayNumber % 2

    val trainingShedule = """
    Упражнения для рук:     ${isEvenDay != 0}
    Упражнения для ног:     ${isEvenDay == 0}
    Упражнения для спины:   ${isEvenDay == 0}
    Упражнения для пресса:  ${isEvenDay != 0}
    """.trimIndent()

    println(trainingShedule)
}
