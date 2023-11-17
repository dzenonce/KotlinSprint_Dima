package lesson4

fun main() {
    val currentWeather = true
    val conditionTent = true
    val airHumiditi = 20
    val currentSeason = "Зима"

    val favorableCondition = (currentWeather == WEATHER) && (conditionTent == CONDITION_TENT) && (airHumiditi == HUMIDITI) && (currentSeason != SEASON)

    println(favorableCondition)
}

const val WEATHER = true
const val CONDITION_TENT = true
const val HUMIDITI = 20
const val SEASON = "Зима"