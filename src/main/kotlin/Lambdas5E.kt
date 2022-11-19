/*
Date: Saturday 19th November 2022, 11:21 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Pass a lambda expression directly into a function,
         Use trailing lambda syntax
         the higher-order function repeat()
File:Lambdas5E.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#0
Ref: Chapter 11, Head First Kotlin, Lambdas and higher order functions
STATUS: COMPLETED
*/

fun main() {
    /*
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }
    */
    // after removing parameter name and substitute with "it"

    val coins: (Int) -> String = {
        "$it quarters"
    }
    // note coins is greyed out (in Android Studio) so is not used in the code now, since
    // instead of the coins variable, the lambda itself is the second
    // (and last) parameter in the call below, instead of the old line
    // val treatFunction = trickOrTreat_v4(false, coins)

    val treatFunction = trickOrTreatV5(false, { "$it quarters" })

    // the above line can be rewritten using a trailing lambda:

    // val treatFunction = trickOrTreatV5(false) { "$it quarters" }

    // try running with the code with trailing lambda and without

    val trickFunction = trickOrTreatV5(true, null)

    // built-in function repeat() is a higher-order function
    // repeat(times: Int, action: (Int) -> Unit)   // use trailing lambda
    repeat(4){
        treatFunction()
    }
    trickFunction()
}


// trickOrTreatV5 is a higher-order function
fun trickOrTreatV5(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trickV5
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treatV5
    }
}

val trickV5 = {
    println("No lovely treats today!")
}

val treatV5 = {
    println("Have a lovely treat!")
}
