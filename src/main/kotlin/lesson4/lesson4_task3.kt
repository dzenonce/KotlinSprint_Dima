package lesson4

fun main() {
    val isSunnyWeather = true
    val isAwningCovered = true
    val airHumiditi = 20
    val currentSeason = "Зима"

    val favorableCondition = (isSunnyWeather == IS_SUNNY_WEATHER) && (isAwningCovered == IS_AWNING_COVERED) && (airHumiditi == HUMIDITI) && (currentSeason != SEASON)

    println(favorableCondition)
}

const val IS_SUNNY_WEATHER = true
const val IS_AWNING_COVERED = true
const val HUMIDITI = 20
const val SEASON = "Зима"