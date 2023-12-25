// Coroutines6async.kt
// 25/12/2023
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {// executes the coroutines sequentially
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    // the coroutineScope function creates a CoroutineScope
    // async creates a coroutine and returns its future result
    // as an implementation of Deferred.
    val forecast = async { getForecast6() }
    // the implied data type of forecast is Deferred String
    // The long version: val forecast: Deferred<String> = async {...}
    val temperature = async { getTemperature6() }
    // Waits for the Deferred objects to complete their asynchronous executions
    "${forecast.await()} ${temperature.await()}"  // last line in the function
    // is the return value
}

suspend fun getForecast6(): String {
    delay(1000)  // simulates an asynchronous operation
    return "Sunny with a few clouds"
}

suspend fun getTemperature6(): String {
    delay(1000)  // simulates an asynchronous operation
    return "25\u00b0C"
}

