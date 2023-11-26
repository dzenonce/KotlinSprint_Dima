package lesson9

fun main() {
    val ingredientList = mutableListOf("Яйцо", "Зелень", "Картошка")

    println("В рецепте есть базовые ингредиенты: ${ingredientList.joinToString()} ")

    println("Желаете добавить еще? Да/Нет")
    val yesOrNoInput = readln()

    if (yesOrNoInput.toLowerCase() == "да" ) {
        println("Какой ингредиент вы хотите добавить?")
        val appendIngredient = readln()

        ingredientList.add(appendIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ${ingredientList.joinToString()}")

    } else return

}