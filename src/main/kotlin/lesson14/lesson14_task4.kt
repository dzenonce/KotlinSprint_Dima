package lesson14

open class CelestialBody(
    val hasSatellite: Boolean = false,
)

class Planet(
    val name: String,
    val hasAtmosphere: Boolean,
    val isPlanetarySuitability: Boolean,
    hasSatellite: Boolean,
    val listSatellite: MutableList<Satellite> = mutableListOf(),
) : CelestialBody(hasSatellite)

class Satellite(
    val name: String,
    val hasAtmosphere: Boolean,
    val isPlanetarySuitability: Boolean,
    hasSatellite: Boolean = false,
) : CelestialBody(hasSatellite)

fun main() {

    val planet = Planet(
        name = "B-253",
        hasAtmosphere = true,
        isPlanetarySuitability = true,
        hasSatellite = true,
    )

    val satellite1 = Satellite(
        name = "S-B-253.1",
        hasAtmosphere = false,
        isPlanetarySuitability = true,
    )

    val satellite2 = Satellite(
        name = "S-B-253.2",
        hasAtmosphere = false,
        isPlanetarySuitability = false,
    )

    planet.listSatellite.addAll(arrayOf(satellite1, satellite2))

    println("У планеты ${planet.name} есть спутники:")
    planet.listSatellite.forEach() { println(it.name) }

}
