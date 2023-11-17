package lesson1

const val SEC_IN_HOUR = 3600
const val MIN_IN_HOUR = 60

fun main() {
    val timeInCosmo = 6480

    val hourInCosmo = timeInCosmo / SEC_IN_HOUR
    val minuteInCosmo = (timeInCosmo % SEC_IN_HOUR) / MIN_IN_HOUR
    val secondInCosmo = timeInCosmo % MIN_IN_HOUR

    val formattedTimeInCosmo = String.format("%02d:%02d:%02d", hourInCosmo, minuteInCosmo, secondInCosmo)

    println(formattedTimeInCosmo)

}

// Ваня, привет, вчера посмотрел твой 4 урок, ты указывал константы снизу, это так положено делать, или без разницы снизу или сверху?