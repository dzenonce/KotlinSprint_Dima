package lesson8

fun main() {
    println("Введите количесво ингредиентов в рецепте")

    var i = 0

    val arrayIngredient =
        Array(readln().toInt()) {
            println("Введите ингредиент ${++i}")
            readln()
        }

    println("В рецепте теперь:")
    arrayIngredient.forEach { ingredients -> println(ingredients) }
}
