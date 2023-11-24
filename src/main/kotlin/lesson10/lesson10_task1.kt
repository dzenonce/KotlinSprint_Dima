package lesson10

fun main() {
    val humanStep = throwADice()
    println("Бросил человек, на костях $humanStep")

    val robotStep = throwADice()
    println("Бросил робот, на костях $robotStep")

    val gameResult = if (humanStep > robotStep) "Победил человек"
    else if (humanStep < robotStep) "Победила машина"
    else "Ничья"

    println(gameResult)
}
// to:do
// Сделать на несколько ходов, с записью в лист результатов и по сумме вывод реза
fun throwADice() : Int = (1..6).random()