fun logMessage(message: String): Unit {
    println(message)
}

fun logMessage(message: String, prefix: String = "info") {
    println("Prefix:$prefix $message ")
}

fun add(x: Int, y: Int): Int = x + y


fun multiply(x: Int, y: Int) = x * y


fun main(){
    logMessage("Hello World")
    logMessage(prefix = "Debug", message = "Kotlin compiler" )
    logMessage(add(1,2).toString())
    logMessage(multiply(1,2).toString())
}