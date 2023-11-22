package lesson8

fun main() {
    val recipeIngredients = arrayOf("Яйцо", "Картошка", "Фарш", "Зелень")

    for (ingredients in recipeIngredients) {
        println("В рецепте есть $ingredients")
    }

    println("\nКакой ингредиент вы хотите изменить?")
    val ingredientForChange = readln()

    if (ingredientForChange in recipeIngredients) {
        println("\nХорошо, какой ингредиент вы хотите добавить вместо выбранного?")
        val newIngredient = readln()

        val indexForReplace = recipeIngredients.indexOf(ingredientForChange)
        recipeIngredients[indexForReplace] = newIngredient

        for (ingredients in recipeIngredients) {
            println("В рецепте есть $ingredients")
        }

    } else println("Выбранного вами ингредиента нет в списке")


}
