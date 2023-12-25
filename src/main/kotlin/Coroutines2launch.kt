// Coroutines2launch.kt
// 25/12/2023

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecast_2()
            }
            launch {
                printTemperature_2()
            }
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}

suspend fun printForecast_2() {
    delay(1000)
    println("Sunny")
}
suspend fun printTemperature_2() {
    delay(1000)
    println("30\u00b0C")
}