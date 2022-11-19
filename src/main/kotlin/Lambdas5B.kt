/*
Date: Wednesday 16th November 2022, 14:53 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Use a function as a return type
File:Lambdas5B.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#0
Ref: Chapter 11, Head First Kotlin, Lambdas and higher order functions
STATUS: COMPLETED
*/
fun main() {
    val trickFunction = trickOrTreat(true)
    val treatFunction = trickOrTreat(false)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trickV2
    } else {
        return treatV2
    }
}
val trickV2 = {
    println("No lovely treats!")
}

val treatV2 = {
    println("Have a lovely treat!")
}
