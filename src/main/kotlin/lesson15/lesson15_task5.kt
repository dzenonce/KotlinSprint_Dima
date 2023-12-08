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

abstract class Transport : MovementCar ,TransportationPassenger{

    abstract val type: String
    abstract val passengerCount: Int
    abstract val isCarryCargo: Boolean
}

class Truck(
    override val type: String,
    override val passengerCount: Int,
    override val isCarryCargo: Boolean,
) : Transport(), TransportationCargo {

    override fun loadPassenger() {
        TODO("Not yet implemented")
    }

    override fun unloadPassenger() {
        TODO("Not yet implemented")
    }

    override fun loadCargo() {
        TODO("Not yet implemented")
    }

    override fun unloadCargo() {
        TODO("Not yet implemented")
    }
}

class PassengerCar(
    override val type: String,
    override val passengerCount: Int,
    override val isCarryCargo: Boolean,
) : Transport() {

    override fun loadPassenger() {
        TODO("Not yet implemented")
    }

    override fun unloadPassenger() {
        TODO("Not yet implemented")
    }

}

const val MAX_PASSENGER_FOR_PASSENGER_CAR = 3
const val MAX_PASSENGER_FOR_TRUCK = 1
const val MAX_CARGO_CAPACITY_TONNAGE = 2000