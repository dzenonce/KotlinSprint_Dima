package lesson5

import java.time.Year
import java.util.Calendar

fun main() {

    print("Введите год вашего рождения: ")
    val userYear = readLine()!!.toInt()

    val calendar: Calendar = Calendar.getInstance()
    val currentYear = calendar.get(Calendar.YEAR)

    val userAge = currentYear - userYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else "Вернуться на главный экран"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18