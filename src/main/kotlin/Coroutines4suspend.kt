// Coroutines4suspend.kt

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecast4()
            }
            launch {
                printTemperature4()
            }
            println("Have a good day!")
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun printForecast4() {
    delay(1000)
    println("Sunny")
}
suspend fun printTemperature4() {
    delay(1000)
    println("30\u00b0C")
}