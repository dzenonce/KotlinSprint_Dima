package lesson12

class Weather(val dayTemperature: Int, val nightTemperature: Int, val isPrecipitationInDay: Boolean) {

}

fun main() {

    val mounthWeather: MutableList<Weather> = mutableListOf()

    val temperatureRange = 10..30
    val chanceOfRain = 1..6


    for (i in 1..30) {
        val dayWeather = Weather(
            dayTemperature = temperatureRange.random(),
            nightTemperature = temperatureRange.random(),
            isPrecipitationInDay = chanceOfRain.random() < 3,
        )
        mounthWeather.add(dayWeather)
    }

    val listDayTemperature: MutableList<Int> = mutableListOf()
    val listNightTemperature: MutableList<Int> = mutableListOf()
    val listPrecipitationDay: MutableList<Boolean> = mutableListOf()

    mounthWeather.map() {
        listDayTemperature.add(it.dayTemperature)
        listNightTemperature.add(it.nightTemperature)
        if (it.isPrecipitationInDay.equals(true)) listPrecipitationDay.add(it.isPrecipitationInDay)
    }

    println(
        """
        Температурная сводка за ${mounthWeather.size} дней:
        ----    ----    ----    ----    ----    ----    ----        
        Средняя дневная температура: ${listDayTemperature.average().toInt()}
        Средняя ночная температура: ${listNightTemperature.average().toInt()}
        Количество дней с осадками: ${listPrecipitationDay.count()}
        """.trimIndent()
    )

}
