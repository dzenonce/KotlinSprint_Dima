package lesson8

fun main() {
    val reciptIngredient = arrayOf("Яйцо", "Картошка", "Фарш", "Зелень")

    println("Какой элемент в массиве вы хотите найти?")
    val userQuery = readln()

    var isIngredientInArray = false

    for (ingredient in reciptIngredient) {
        if (ingredient.equals(userQuery)) {
            isIngredientInArray = true
            break
        }
    }

    val searchResult = if (isIngredientInArray == true) "Ингредиент $userQuery в рецепте есть"
    else "Такого ингредиента в рецепте нет"

    println(searchResult)
}