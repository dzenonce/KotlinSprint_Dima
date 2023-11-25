package lesson10

fun main() {
    println("Какой длинны пароль вы хотите?")
    val password = passwordGenerate(readln().toInt())

    println(password)
}

fun passwordGenerate(passLength: Int) : String {
    val numeric = 0..9
    val wildcards = "!\"#\$%&'()*+,-./ "

    var password = ""

    for (i in 1..passLength / 2) {
        password += numeric.random().toString() + wildcards.random().toString()
    }

    return password

}