package lesson11

class Forum(
    val memberList: MutableList<ForumMember> = mutableListOf(),
    val forunMessage: MutableList<String> = mutableListOf(),
) {

    fun newForumMember(userName: String): ForumMember {
        var userCount = memberList.size

        val userName = ForumMember(
            userId = userCount + 1,
            userName = userName,
        )

        memberList.add(userName)
        return userName

    }

    fun createNewMessage(userId: Int, message: String) {

        val forum = Forum()

        val hasUsersInList = forum.memberList.map { it.userId == userId }

        if (hasUsersInList.equals(true)) {
                println(message)
        } else

}

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,

    )

fun main() {

    val forum = Forum()

    val user1 = forum.newForumMember("mai")
    val user2 = forum.newForumMember("ma")
    val user3 = forum.newForumMember("mami")

    println("${user1.userId} ,${user1.userName}")
    println("${user2.userId} ,${user2.userName}")
    println("${user3.userId} ,${user3.userName}")

    forum.createNewMessage(user1.userId, "Привет")

}