package lesson19

class Spaceship {

    fun takeOff(): Nothing = throw NotImplementedError()

    fun toLand() {
        TODO()
    }

    fun shootAtAsteroid() {}

}

fun main() {

    Spaceship().shootAtAsteroid()

}