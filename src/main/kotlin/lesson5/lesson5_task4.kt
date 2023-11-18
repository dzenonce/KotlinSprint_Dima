package lesson5

fun main() {
    val userLoginZaphod = "Zaphod"
    val passwordZaphoda = "PanGalactic"

    println("Самый печальный робот в галактике Марвин говорит: \nВведите свой логин: ")
    val inputUserLogin = readLine()

    println("А теперь пароль: ")
    val inputUserPassword = readLine()

    if (inputUserLogin != userLoginZaphod) println("Пользователь не найден!\nХотите зарегистрироваться?")
    else if (inputUserPassword == passwordZaphoda) println("Добро пожаловать $inputUserLogin")
    else println("Пароль не верный!")
}