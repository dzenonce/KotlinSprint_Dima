package lesson15

interface Floating {

    fun swimInWater()

}

interface Flying {

    fun flyInSky()

}

interface Going {

    fun walkOnLand()

}

class Carp(
    val name: String = "Карась",
) : Floating {

    override fun swimInWater() {
        println("$name плывет в воде двигая плавниками")
    }

}

class Seagull(
    val name: String = "Чайка",
) : Flying, Going {

    override fun flyInSky() {
        println("$name летит в небе двигая крыльями")
    }

    override fun walkOnLand() {
        println("$name идет по земле перебирая лапами")
    }

}

class Duck(
    val name: String = "Утка",
) : Floating, Flying, Going {

    override fun swimInWater() {
        println("$name плывет по воде, гребя лапами")
    }

    override fun flyInSky() {
        println("$name летит размахивая крыльями")
    }

    override fun walkOnLand() {
        println("$name идет по земле перебирая лапами")
    }

}

fun main() {

    val duck = Duck()
    val carp = Carp()
    val seagull = Seagull()

    duck.flyInSky()
    duck.swimInWater()
    duck.walkOnLand()

    carp.swimInWater()

    seagull.flyInSky()
    seagull.walkOnLand()

}

