package lesson9

fun main() {

    val listIngredients = mutableListOf<String>()

    println("Введите 5 ингредиентов: ")

    for (i in 0 until 5) {
        listIngredients.add(readln())
    }

    val sortedList = listIngredients.sorted().joinToString(separator = ", ") { it.capitalize() }

    sortedList.forEach() { print(it) }

}
