/*
Date: Monday 6th February 2023, 11:48 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions5_groupBy1.kt
Codelab title: Higher-order functions with collections
Topic: The groupBy() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#4
*/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    // The groupBy() function can be used to
    // turn a list into a map, based on a lambda function.
    // Note data type of groupedNumbers is: Map<String, List<Int>>
    val groupedNumbersMap1 = numbers.groupBy {
        if (it % 2 == 0) "even" else "odd"
    }
    println()
    println(groupedNumbersMap1)
    // Output:
    // {odd=[1, 3, 5], even=[2, 4]}


    //The groupBy() function is called with the following lambda expression:
    // { it % 2 }.
    val groupedNumbersMap2 = numbers.groupBy {
        it % 2
    }
    println()
    println(groupedNumbersMap2)
    // Output:
    //  {1=[1, 3, 5], 0=[2, 4]}
}


