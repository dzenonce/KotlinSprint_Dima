package lesson8

fun main() {
    println("Введите количесво ингредиентов в рецепте")
    val quantityIngredients = readln().toInt()

    var arrayIngredient = Array (quantityIngredients) { "" }

    for (items in 0 until quantityIngredients) {
        println("Введите ингредиент ${items + 1}")
        val ingredients = readln()
        arrayIngredient[items] = ingredients
    }

    println("В рецепте теперь:")
    arrayIngredient.forEach { ingredients -> println(ingredients) }
}
