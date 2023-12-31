package lesson5

fun main() {
    val userLoginZaphod = "Zaphod"
    val passwordZaphoda = "PanGalactic"

    println("""
    Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту
    корабля "Heart of Gold". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы
    могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но
    вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные...    
    """.trimIndent()
    )
    val inputUserLogin = readln()

    println("А теперь пароль: ")
    val inputUserPassword = readln()

    if (inputUserLogin != userLoginZaphod) println("Пользователь не найден!\nХотите зарегистрироваться?")
    else if (inputUserPassword == passwordZaphoda) println("""
        [вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь '$inputUserLogin',
        вам разрешено входить на борт корабля "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите... 
        Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
        """.trimIndent()
    )
    else println("Пароль не верный!")
}