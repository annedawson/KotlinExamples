// Coroutines7throwException.kt
// 25/12/2023
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() {
    runBlocking {// runBlocking used for testing purposes
        println("Weather forecast")
        println(getWeatherReport7())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport7() = coroutineScope {
    // the coroutineScope function creates a CoroutineScope
    // async creates a coroutine and returns its future result
    // as an implementation of Deferred.

    val forecast = async { getForecast7() }
    // the implied data type of forecast is Deferred String
    // The long version: val forecast: Deferred<String> = async {...}

    val temperature = async { getTemperature7() }
    // Waits for the Deferred objects to complete their asynchronous executions

    "${forecast.await()} ${temperature.await()}"  // last line in the function
    // is the return value, return values are explained in the following note:
    // https://www.evernote.com/shard/s223/nl/45293182/a5033b41-7a63-9d9a-d25b-ee93227be838?title=P16%20-%20Course:%20Android%20Basics%20with%20Compose%20-%20Notes%20Part%2016%20-%20Unit%205:%20Connect%20to%20the%20internet%20-%20Pathway%201:%20Get%20data%20from%20the%20internet%20using%20coroutines
}

suspend fun getForecast7(): String {
    delay(1000)  // simulates an asynchronous operation
    return "Sunny with a few clouds"
}

suspend fun getTemperature7(): String {
    delay(500)  // simulates an asynchronous operation
    throw AssertionError("Temperature is invalid")
    // comment out the line above and rerun to see the effect
    return "25\u00b0C" // \u00b0 is the Unicode code for the degree symbol
}

