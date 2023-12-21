package lesson22

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

    println("""
        Название: ${alphaCentauri.component1()}
        Описание: ${alphaCentauri.component2()}
        Дата: ${alphaCentauri.component3()}
        Дистанция: ${alphaCentauri.component4()} световых лет
    """.trimIndent())


}