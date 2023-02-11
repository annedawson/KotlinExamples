/*
Date: Wednesday 8th February 2023, 9:17 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions6_fold.kt
Codelab title: Higher-order functions with collections
Topic: The fold() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#5
*/

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf<Int>()
    val initialValue = 0
    // the lambda below returns acc + value (iterated over the list)
    val result1 = list1.fold(initialValue) { acc, value -> acc + value }
    println(result1) // Output: 15
    println(list1.sum())  // Output: 15 (sum can only be used with type Int)
    val result2 = list2.fold(initialValue) { acc, value -> acc + value }
    println(result2) // Output: 0
    println(list2.sum())  // Output: 0
    println("----------------------------")
    val totalPrice = cookies.fold(0.0) {total, cookie ->
        total + cookie.price
    }
    println("Total price: $${totalPrice}")
}









