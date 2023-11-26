package lesson11

class UserData(
    val uid: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {

    val user1 = UserData(
        uid = 1,
        login = "User1",
        password = "123",
        email = "mail@rambler.ru"
    )

    val user2 = UserData(
        uid = 2,
        login = "User2",
        password = "123",
        email = "mail2@ya.ru"
    )

    println("""
           Данные пользователя ${user1.login}.
           Uid      - ${user1.uid}
           Login    - ${user1.login}
           Password - ${user1.password}
           email    - ${user1.email}
           """.trimIndent()
    )

    println()

    println("""
           Данные пользователя ${user2.login}
           Uid      - ${user2.uid}
           Login    - ${user2.login}
           Password - ${user2.password}
           email    - ${user2.email}
           """.trimIndent()
    )

}