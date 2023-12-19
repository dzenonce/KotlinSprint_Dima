package lesson22

class HitchhikerGuide(
    val galacticGuide: MutableList<GalacticGuide> = mutableListOf(),
)

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val eventDateAndTime: String,
    val distanceFromEarthInLightYears: Double,
)

fun main() {

    val alphaCentauri = GalacticGuide(
    nameOfPlaceOrEvent = "Галактика Альфа Центавра",
    descriptionOfPlaceOrEvent =
        """Альфа Центавра - триплет звезд в созвездии Центавра, являющийся одним из ближайших звездных систем к Солнечной. 
         Он состоит из трех звезд: Альфа Центавра A, Альфа Центавра B и Проксима Центавра (также известной как Альфа Центавра C).
            Альфа Центавра A и B образуют двойную звездную систему, в то время как Проксима Центавра находится на некотором расстоянии от них.""".trimIndent(),
    eventDateAndTime = "4.85 млрд лет",
    distanceFromEarthInLightYears = 4.24,
    )

    val guide = HitchhikerGuide()

    guide.galacticGuide.add(alphaCentauri)

    val (name, description, date, distance) = guide.galacticGuide.component1()

    println("""
        Название: $name
        Описание: $description
        Дата: $date
        Дистанция: $distance световых лет
    """.trimIndent())


}