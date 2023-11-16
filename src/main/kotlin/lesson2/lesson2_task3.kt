package lesson2

const val sixty = 60

fun main() {
    val departTimeHour = 9
    val departTimeMinute = 39

    val travelTimeMinute = 457

    val departTimeHourInMinute = departTimeHour * sixty

    val arrivalTimeInMinute = departTimeHourInMinute + departTimeMinute + travelTimeMinute
    val hourOfArrival = arrivalTimeInMinute / sixty
    val minuteOfArrival = arrivalTimeInMinute % sixty

    println("Время прибытия: $hourOfArrival:$minuteOfArrival")
}