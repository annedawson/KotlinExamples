/*
Date: Tuesday 15th November 2022, 8:33 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File:Lambdas_5.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-training-classes-and-inheritance#0
STATUS: NOT COMPLETED
*/

/*  One way to call the function

fun main() {
    // :: is the function reference operator
    val trickFunction = ::trick
    trickFunction()
}
fun trick() {
    println("No treats!")
}

 */

// a better way using a function literal aka a lambda

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}


/*
 If you want to specify the type of a function parameter or a return type,
 you need to know the syntax for expressing function types.
 Function types consist of a set of parentheses that contain
 an optional parameter list, the -> symbol, and a return type.
 */
val trick = {
    println("No treats!")
}
val treat: () -> Unit = {
    println("Have a treat!")
}
