/*
Date: Monday 6th February 2023, 13:25 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions5_groupBy2.kt
Codelab title: Higher-order functions with collections
Topic: The groupBy() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#4
*/


// Uses CookieVer3 and cookiesVer3 (list of CookieVer3)
// from CollectionsHigherOrderFunctions4_filter.kt

fun main() {
    // forEach on a list
    /*cookiesVer3.forEach {
        println("Menu item: ${it.name}")
    }*/
    val groupedMenu = cookiesVer3.groupBy { it.softBaked }

    val softBakedMenu = groupedMenu[true] ?: listOf()
    val crunchyMenu = groupedMenu[false] ?: listOf()

    println("\nSoft cookies:\n")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }
    println("\n\nCrunchy cookies:\n")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}



