package lesson21

fun List<Int>.evenNumbersSum() = filter { it % 2 == 0 }.sum()

fun main() {

    val numberList = listOf(1, 2, 4, 7, 6, 5)

    println(numberList.evenNumbersSum())

}