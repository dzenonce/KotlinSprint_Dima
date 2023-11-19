package lesson4

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_CAPACITY = 100

fun main() {
    val firstCargoKg = 20
    val firstCargoCapacity = 80

    val secondCargoKg = 50
    val secondCargoCapacity = 100

    println("""
        Груз с весом $firstCargoKg кг и объемом $firstCargoCapacity л соответствует категории 'Average': ${ (firstCargoKg >= MINIMUM_WEIGHT) && (firstCargoKg <= MAXIMUM_WEIGHT) && (firstCargoCapacity < MAXIMUM_CAPACITY) }
        Груз с весом $secondCargoKg кг и объемом $secondCargoCapacity л соответствует категории 'Average': ${ (secondCargoKg >= MINIMUM_WEIGHT) && (firstCargoKg <= MAXIMUM_WEIGHT) && (secondCargoCapacity < MAXIMUM_CAPACITY) }
    """.trimIndent())
}