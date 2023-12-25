// Coroutines5async.kt
// 25/12/2023
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Weather forecast")
        val forecast: Deferred<String> = async {
            getForecast5()
        }
        val temperature: Deferred<String> = async {
            getTemperature5()
        }
        println("${forecast.await()} ${temperature.await()}")
        println("Have a good day!")
    }
}

suspend fun getForecast5(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature5(): String {
    delay(1000)
    return "30\u00b0C"
}