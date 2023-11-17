package lesson2

const val ONE_HUNGRED_PERCENT = 100

fun main() {
    val crystalOre = 7.0
    val ironOre = 11.0
    val buffPercent = 20

    val buffCrystalOre = (crystalOre / ONE_HUNGRED_PERCENT) * buffPercent
    val buffIronOre = (ironOre / ONE_HUNGRED_PERCENT) * buffPercent

    println(buffCrystalOre.toInt())
    println(buffIronOre.toInt())

}