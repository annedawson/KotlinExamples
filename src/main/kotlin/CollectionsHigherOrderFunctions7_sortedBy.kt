/*
Date: Thursday 9th February 2023, 12:34 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions7_sortedBy.kt
Codelab title: Higher-order functions with collections
Topic: The sortedBy() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#6
*/

fun main() {
    val list1 = listOf(11, 2, 13, 14, 5)
    var list2 = listOf<Int>()
    println(list1.sorted())  // sorted() does not change the original list
    list2 = list2 + list1
    println(list2)

    // if you have a list of objects of the Cookie class, sorted() does not
    // have enough information to sort as there are several potential search properties
    // i.e. name, softBaked, hasFilling and price.

    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetical menu:")
    alphabeticalMenu.forEach {
        println(it.name)
    }
}









