import java.util.*

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)
    println(5 times "Kashyap")


    infix fun String.onto(other: String) = Pair(this, other)
    println("first " onto "second")

    val me = Likes()
    val friend = Likes()

    me liked friend

}

class Likes() {

    private val postLikes = mutableListOf<Likes>()

    infix fun liked(like: Likes) = postLikes.add(like)

}


