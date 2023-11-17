package lesson3

fun main() {
    var calculateNumber = 9

    var multiplicationTable = """
    $calculateNumber * 1 = ${calculateNumber*1}
    $calculateNumber * 2 = ${calculateNumber*2}
    $calculateNumber * 3 = ${calculateNumber*3}
    $calculateNumber * 4 = ${calculateNumber*4}
    $calculateNumber * 5 = ${calculateNumber*5}
    $calculateNumber * 6 = ${calculateNumber*6}
    $calculateNumber * 7 = ${calculateNumber*7}
    $calculateNumber * 8 = ${calculateNumber*8}
    $calculateNumber * 9 = ${calculateNumber*9}
    """.trimIndent()

    println(multiplicationTable)
}