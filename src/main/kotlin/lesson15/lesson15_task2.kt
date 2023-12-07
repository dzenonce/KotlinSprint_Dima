package lesson15

abstract class WeatherStationStats

class Temperature(
    val morningTemperature: Double,
    val dayTemperature: Double,
    val nightTemperature: Double,
) : WeatherStationStats()

class PrecipitationAmount(
    val precipitation: Double,
) : WeatherStationStats()

class WeatherServer {

    fun sendWeatherData(weatherData: WeatherStationStats) {
        if (weatherData is Temperature) {
            println("Отправляются данные о температуре")
        } else if (weatherData is PrecipitationAmount) {
            println("Отправляются данные о влажности")
        }
    }

}

fun main() {

    val temperature = Temperature(
        1.1,
        3.2,
        5.7,
    )

    val server = WeatherServer()

    server.sendWeatherData(temperature)

}