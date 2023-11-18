package lesson4

fun main() {

    println("Есть ли у корабля повреждения (введите true/false): ")
    val shipDamage = readLine().toBoolean()

    println("Введите количество экипажа: ")
    val crewSize = readLine()!!.toInt()

    println("Введите количество ящиков провизии: ")
    val amountProvision = readLine()!!.toInt()

    println("Введите подходящие ли погодныве условия (true/false): ")
    val weatherCondition = readLine().toBoolean()

//  Здесь не учитываю погоду, поскольку в штатных условиях корабль может отплыть при любой погоде
    val departureShip =
        (shipDamage == DAMAGE_SHIP) && (crewSize in MINIMUM_CREW..MAXIMUM_CREW) && (amountProvision >= MINIMUM_SUPPLY_CRATES)
    println("Может ли корабль уйти в море: $departureShip")

    if (departureShip != true) {
        val departureDamagedShip =
            (shipDamage != DAMAGE_SHIP) && (crewSize == MAXIMUM_CREW) && (weatherCondition == GOOD_WEATHER) && (amountProvision >= MINIMUM_SUPPLY_CRATES)
        println("Может ли поврежденный корабль уйти в море: $departureDamagedShip")
    }

}

const val DAMAGE_SHIP = false

const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70

const val MINIMUM_SUPPLY_CRATES = 50

const val GOOD_WEATHER = true