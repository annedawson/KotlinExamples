/*
Date: Saturday 4th February 2023, 10:21 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions5_groupBy.kt
Codelab title: Higher-order functions with collections
Topic: The groupBy() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#4
*/

fun main() {
// All the following 6 lines from ChatGPT
    val numbers = listOf(1, 2, 3, 4, 5)
    val groupedNumbers = numbers.groupBy {
        if (it % 2 == 0) "even" else "odd"
    }
    println(groupedNumbers)
// Output: {even=[2, 4], odd=[1, 3, 5]}

}
