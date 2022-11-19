/*
Date: Friday 18th November 2022, 9:19 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Pass a function to another function as an argument
File:Lambdas5C.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#0
Ref: Chapter 11, Head First Kotlin, Lambdas and higher order functions
STATUS: NOT COMPLETED
*/

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    /*
     val cupcake: (Int) -> String = {quantity ->
        "Have a cupcake!"
    }
   */

    // quantity is not used, so remove the quantity ->
    // the single parameter is now known as "it" but it is not used
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickortreatV3(false, coins)
    val trickFunction = trickortreatV3(true, cupcake)

    treatFunction()
    trickFunction()
}

fun trickortreatV3(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trickV3
    } else {
        println(extraTreat(5))
        return treatV3
    }
}


val trickV3 = {
    println("No lovely treats!")
}

val treatV3 = {
    println("Have a lovely treat!")
}
