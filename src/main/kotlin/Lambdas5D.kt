/*
Date: Friday 18th November 2022, 10:00 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Nullable function types
File:Lambdas5D.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#0
Ref: Chapter 11, Head First Kotlin, Lambdas and higher order functions
STATUS: COMPLETED
*/

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = trickortreatV4(false, coins)
    val trickFunction = trickortreatV4(true, null)

    treatFunction()
    trickFunction()
}

    fun trickortreatV4(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick_v4
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat_v4
    }
}


val trick_v4 = {
    println("No lovely treats!")
}

val treat_v4 = {
    println("Have a lovely treat!")
}
