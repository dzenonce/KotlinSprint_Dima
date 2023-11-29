package lesson11

class User(
    var avatar: String = "defaultUserAvatar.jpg",
    val nickname: String,
    val status: String,
) {

    fun longTapOnAvatar() {
        println(
            """
            :$avatar:
            :$nickname:
            :$status:
        """.trimIndent()
        )
    }
}

class ChatRoom(
    val roomCover: String = "DefaultRoomCover.jpg",
    val roomName: String,
    val membersList: List<String>,
)

fun main() {

    val user1 = User(
        nickname = "Abba",
        status = "Разговаривает",
    )

    val room1 = ChatRoom(
        roomName = "MyRoom",
        membersList = listOf(user1.avatar),
    )

    println(room1.roomCover)
    println(room1.roomName)
    println(room1.membersList)
    println()
    user1.longTapOnAvatar()
}
