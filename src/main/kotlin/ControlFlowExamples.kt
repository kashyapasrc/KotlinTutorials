
fun max(a: Int, b: Int) = if (a > b) a else if (a == b) a else b


fun main() {

//Conditional expressions
    println(max(1, 3))

//Ranges

    for (i in 0..3) {
        print(i)
    }
    println()
    for (i in 0 until 3)
        print(i)
    println()
    for (i in 0 .. 8 step 2)
        print(i)
    println()
    for (i in 3 downTo 0)
        print(i)


}