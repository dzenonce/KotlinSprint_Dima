package lesson2

import kotlin.math.pow

fun main() {

    /*
    A=P(1+r)t

        A - конечная сумма (вклад с процентами),
        P - начальная сумма вклада,
        r - годовая процентная ставка (в десятичных долях),
        t - количество лет.
    */

    val deposit = 70000
    val interestRate = 16.7
    val depositTerm = 20


    val finalAmount = deposit * (1+interestRate/100).pow(depositTerm)

    println(String.format("%.3f", finalAmount))

}
