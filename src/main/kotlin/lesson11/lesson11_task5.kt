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

    fun createNewMessage(user: ForumMember, message: String) {
        val forum = Forum()

        for (i in 0 .. memberList.size) {
            if (forum.memberList[i].userId.equals(user.userId)) println("Есть $message")
            else println("Нет")
        }

    }

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
    println(forum.memberList.size)
    val user1 = forum.newForumMember("mai")
    val user2 = forum.newForumMember("ma")
    val user3 = forum.newForumMember("mami")


    println("${user1.userId} ,${user1.userName}")
    println("${user2.userId} ,${user2.userName}")
    println("${user3.userId} ,${user3.userName}")

    println(forum.memberList[0].userName)

    val id = 1
    forum.memberList.forEach() { println(it) }

    forum.createNewMessage(user1, "Привет")

}