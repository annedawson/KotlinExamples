// Coroutines9trycatch.kt
// 25/12/2023
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {// runBlocking used for testing purposes here
        println("Weather forecast")
        println(getWeatherReport9())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport9() = coroutineScope {
    // the coroutineScope function creates a CoroutineScope
    // async creates a coroutine and returns its future result
    // as an implementation of Deferred.

    val forecast = async { getForecast9() }
    // the implied data type of forecast is Deferred String
    // The long version: val forecast: Deferred<String> = async {...}



    val temperature = async {
        try {
            getTemperature9()
        } catch (e: AssertionError) {
            println("Caught exception $e")
            "{ No temperature found }"
        }

       }

    // Waits for the Deferred objects to complete their asynchronous executions
    "${forecast.await()} ${temperature.await()}"
    // the last line in a function is the return value
}

suspend fun getForecast9(): String {
    delay(1000)  // simulates an asynchronous operation
    return "Sunny with a few clouds"
}

suspend fun getTemperature9(): String {
    delay(500)  // simulates an asynchronous operation
    throw AssertionError("Temperature is invalid")  // throws an exception
    return "25\u00b0C" // \u00b0 is the Unicode code for the degree symbol
}