package lesson9

fun main() {
    println("Введите 5 ингредиентов разделяя их запятой с пробелом")
    val ingredientInput = readln()

    val listIngredients = ingredientInput.split(", ").sorted()

    listIngredients.forEach() { println(it) }

}