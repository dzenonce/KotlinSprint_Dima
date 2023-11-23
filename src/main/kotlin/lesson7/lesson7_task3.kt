package lesson7

fun main() {
    println("Введите число, до которого необходимо показать все четные числа:")
    val userNumber = readln().toInt()

    for (evenNumbers in 0..userNumber step 2) {
        println(evenNumbers)
    }
}