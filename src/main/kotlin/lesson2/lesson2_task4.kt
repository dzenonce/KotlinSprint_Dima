package lesson2

const val OneHungredPercent = 100

fun main() {
    val crystalOre = 7.0
    val ironOre = 11.0
    val buffPercent = 20

    val buffCrystalOre = (crystalOre / OneHungredPercent) * buffPercent
    val buffIronOre = (ironOre / OneHungredPercent) * buffPercent

    println(buffCrystalOre.toInt())
    println(buffIronOre.toInt())

}