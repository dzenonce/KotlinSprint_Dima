package lesson9

import java.util.*

fun main() {

    val listIngredients = mutableListOf<String>()

    println("Введите 5 ингредиентов: ")

    for (i in 0 until 5) {
        listIngredients.add(readln())
    }

    val sortedList = listIngredients.sorted().joinToString(separator = ", ") { it.replaceFirstChar {
        if (it[0].isLowerCase()) it.titlecase(
            Locale.getDefault()
        ) else it.toString()
    } }

    sortedList.forEach() { print(it) }

}
