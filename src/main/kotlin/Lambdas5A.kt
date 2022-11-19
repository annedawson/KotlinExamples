/*
Date: Wednesday 16th November 2022, 14:50 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Use functions as a data type
File:Lambdas5A.kt
Codelab title: Use function types and lambda expressions in Kotlin
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-function-types-and-lambda#0
Ref: Chapter 11, Head First Kotlin, Lambdas and higher order functions
STATUS: COMPLETED
*/

/*  One way to call the function

fun main() {
    // to refer to a function as a *** value *** i.e the lambda,
    // you need to use the function reference operator
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
// in the case of the statement
//
// In the case of trick, the type of the variable - the function type
// was determined from the literal value assigned,
// the function literal - aka the lambda.

val trick = {
    println("No treats!")
}

/*
 If you want to specify the type of a function parameter or a return type,
 you need to know the syntax for expressing function types.
 Function types consist of a set of parentheses that contain
 an optional parameter list, the -> symbol, and a return type.
 */

val treat: () -> Unit = {
    println("Have a treat!")
}

//  Int               is the data tpe of an integer
//  String            is the data type of a sting
//  () -> Unit        is the data type of a function with no parameters, returning nothing
//  (Int) -> String   is the data type of a function with a single integer parameter, returning a string

