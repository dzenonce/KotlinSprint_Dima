package lesson8

fun main() {
    val recipeIngredients = arrayOf("Яйцо", "Картошка", "Фарш", "Зелень")

    println("Какой ингредиент вы хотите найти? ")
    val userQuery = readln()

    val searchIngredientResult = if (userQuery in recipeIngredients) "Ингредиент $userQuery есть в рецепте"
    else "Ингредиента в рецепте нет"

    println(searchIngredientResult)
}