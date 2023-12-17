package lesson18

abstract class TamagotchiAnimal {

    abstract fun play()
    abstract fun sleep()
    abstract fun eat()

}

class Fox(
    private val name: String = "Лиса",
    private val food: String = "ягоды",
) : TamagotchiAnimal() {

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")

    }

    override fun eat() {
        println("$name - ест $food")

    }

}

class Dog(
    private val name: String = "Собака",
    private val food: String = "кость",
) : TamagotchiAnimal() {

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")

    }

    override fun eat() {
        println("$name - ест $food")

    }

}

class Cat(
    private val name: String = "Кошка",
    private val food: String = "рыба",
) : TamagotchiAnimal() {

    override fun play() {
        println("$name - играет")
    }

    override fun sleep() {
        println("$name - спит")

    }

    override fun eat() {
        println("$name - ест $food")

    }

}

fun main() {

    val fox = Fox()
    val cat = Cat()
    val dog = Dog()

    val animalsList = listOf<TamagotchiAnimal>(fox, dog, cat)

    animalsList.forEach {
        it.eat()
        it.sleep()
        it.play()
    }

}
