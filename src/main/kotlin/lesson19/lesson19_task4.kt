package lesson19

enum class Bullet(
    val damege: Int,
) {

    BLUE(5),
    GREEN(10),
    RED(20);

}

class Tank {

    private var bulletInGun: Bullet? = null

    fun loadGun(bullet: Bullet?) {
        bulletInGun = bullet
    }

    fun shoot() {
        println("Выстрел, урон: ${bulletInGun?.damege}")
    }

}

fun main() {

    val tank = Tank()

    tank.shoot()

    tank.loadGun(Bullet.BLUE)
    tank.shoot()

    tank.loadGun(Bullet.RED)
    tank.shoot()

    tank.loadGun(Bullet.GREEN)
    tank.shoot()

}
