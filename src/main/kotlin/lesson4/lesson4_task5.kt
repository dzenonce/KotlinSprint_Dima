package lesson4

fun main() {

    println("Есть ли у корабля повреждения (введите true/false): ")
    val isShipDamage = readln().toBoolean()

    println("Введите количество экипажа: ")
    val crewSize = readln()?.toInt()

    println("Введите количество ящиков провизии: ")
    val amountProvision = readln()?.toInt()

    println("Введите подходящие ли погодные условия (true/false): ")
    val isSunnyWeather = readln().toBoolean()

//  Здесь не учитываю погоду, поскольку в штатных условиях корабль может отплыть при любой погоде
    val isShipReady =
        (isShipDamage == HAS_DAMAGE_SHIP) && (crewSize in MINIMUM_CREW..MAXIMUM_CREW) && (amountProvision!! > MINIMUM_SUPPLY_CRATES)
    println("Может ли корабль уйти в море: $isShipReady")

    if (isShipReady != true) {
        val isDamagedShipReady =
            (isShipDamage != HAS_DAMAGE_SHIP) && (crewSize == MAXIMUM_CREW) && (isSunnyWeather == IS_SUNNY_WEATHER) && (amountProvision!! >= MINIMUM_SUPPLY_CRATES)
        println("Может ли поврежденный корабль уйти в море: $isDamagedShipReady")
    }

}

const val HAS_DAMAGE_SHIP = false

const val MINIMUM_CREW = 55
const val MAXIMUM_CREW = 70

const val MINIMUM_SUPPLY_CRATES = 50

const val IS_SUNNY_WEATHER = true