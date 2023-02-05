/*
Date: Wednesday 1st February 2023, 9:36 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions1_repeat.kt
Codelab title: Higher-order functions with collections
Topic: The repeat() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#0
*/

/*  This is the definition of repeat():
@InlineOnly
public inline fun repeat(
    times: Int,
    action: (Int) -> Unit
): Unit
*/

fun main() {

    // repeats the greeting three times
    repeat(3) {  // action parameter expressed as trailing lambda
        println("Hello")
    }
    // greets with an index
    repeat(3) { index ->
        println("Hello with index $index")
    }
    // greets with it - the default name of a single parameter in a lambda
    repeat(3) {
        println("Hello with it index $it")
    }
    repeat(0) {
        error("We should not get here!")
    }

}