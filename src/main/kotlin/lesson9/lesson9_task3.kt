package lesson9

fun main() {
    val onePortionCount = listOf(2, 50, 15)

    println("На какое количество порций расчитать ингредиенты? ")
    val userPortion = readln().toInt()

    val ingredientAnyPortion = onePortionCount.map { it * userPortion }

    println("На $userPortion порций вам понадобится: Яиц - ${ingredientAnyPortion[0]} шт., молока - ${ingredientAnyPortion[1]} мл., сливочного масла - ${ingredientAnyPortion[2]} гр.")

}