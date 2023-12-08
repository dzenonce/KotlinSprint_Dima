package lesson15

interface MovementCar {

    fun startEngine() {
        println("Запуск двигателя")
    }

    fun driveCar() {
        println("Авто в движении")
    }

    fun stopCar() {
        println("Остановка автомобиля")
    }
}

interface TransportationPassenger {

    fun loadPassenger()
    fun unloadPassenger()

}

interface TransportationCargo {

    fun loadCargo()
    fun unloadCargo()

}

abstract class Transport(
    val passengerCount: Int,
) : MovementCar, TransportationPassenger

class Truck(
    passengerCount: Int,
    val cargoQuantity: Int,
) : Transport(passengerCount), TransportationCargo {

    override fun loadPassenger() {
        val passengerLoadResult =
            if (passengerCount <= MAX_PASSENGER_FOR_TRUCK) "Берем $passengerCount пассажира с собой"
            else "Максимальное кол-во пассажиров $MAX_PASSENGER_FOR_TRUCK"

        println(passengerLoadResult)
    }

    override fun unloadPassenger() {
        println("Высаживаем $passengerCount человек")
    }

    override fun loadCargo() {
        val resultLoadCargo = if (cargoQuantity <= MAX_CARGO_CAPACITY_TONNAGE) "Загружаем $cargoQuantity кг груза!"
        else "Максимально допустимый вес груза $MAX_CARGO_CAPACITY_TONNAGE"

        println(resultLoadCargo)
    }

    override fun unloadCargo() {
        println("Разгружаем $cargoQuantity кг груза!")
    }
}

class PassengerCar(
    passengerCount: Int,
) : Transport(passengerCount) {

    override fun loadPassenger() {
        val passengerLoadResult =
            if (passengerCount <= MAX_PASSENGER_FOR_PASSENGER_CAR) "Берем $passengerCount человек с собой"
            else "Максимальное кол-во пассажиров $MAX_PASSENGER_FOR_PASSENGER_CAR"

        println(passengerLoadResult)

    }

    override fun unloadPassenger() {
        println("Высаживаем $passengerCount человек")
    }

}

fun main() {

    val truck = Truck(
        passengerCount = 1,
        cargoQuantity = 2000,
    )

    val car = PassengerCar(
        passengerCount = 3,
    )

    val car2 = PassengerCar(
        passengerCount = 2,
    )


    truck.loadCargo()
    truck.loadPassenger()
    truck.startEngine()
    truck.driveCar()
    truck.stopCar()
    truck.unloadPassenger()
    truck.unloadCargo()

    println()

    car.loadPassenger()
    car.startEngine()
    car.driveCar()
    car.stopCar()
    car.unloadPassenger()

    println()

    car2.loadPassenger()
    car2.startEngine()
    car2.driveCar()
    car2.stopCar()
    car2.unloadPassenger()


}

const val MAX_PASSENGER_FOR_PASSENGER_CAR = 3
const val MAX_PASSENGER_FOR_TRUCK = 1
const val MAX_CARGO_CAPACITY_TONNAGE = 2000