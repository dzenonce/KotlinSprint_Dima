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

    val passengerCount: Int
    val maxPassenger: Int

    fun loadPassenger() {
        val passengerLoadResult =
            if (passengerCount <= maxPassenger) "Берем $passengerCount пассажира с собой"
            else "Максимальное кол-во пассажиров $maxPassenger"

        println(passengerLoadResult)
    }

    fun unloadPassenger() {
        println("Высаживаем $passengerCount человек")
    }

}

interface TransportationCargo {

    val cargoQuantity: Int
    val maxCargoCapacity: Int

    fun loadCargo() {
        val resultLoadCargo = if (cargoQuantity <= maxCargoCapacity) "Загружаем $cargoQuantity кг груза!"
        else "Максимально допустимый вес груза $maxCargoCapacity"

        println(resultLoadCargo)
    }

    fun unloadCargo() {
        println("Разгружаем $cargoQuantity кг груза!")
    }

}

class Truck(
    override val passengerCount: Int,
    override val maxPassenger: Int = 1,
    override val cargoQuantity: Int,
    override val maxCargoCapacity: Int = 2000,
) : MovementCar, TransportationCargo, TransportationPassenger

class PassengerCar(
    override val passengerCount: Int,
    override val maxPassenger: Int = 3,
) : MovementCar, TransportationPassenger

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
