import java.lang.Exception

fun main() {


    try {
        val message = "Hello"
        message.toInt()
    } catch (e: Exception) {
        println(e.localizedMessage)
    } finally {
        println("pogi pa rin")
    }
}