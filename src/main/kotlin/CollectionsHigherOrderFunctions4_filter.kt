/*
Date: Thursday 2nd February 2023, 8:11 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions4_filter.kt
Codelab title: Higher-order functions with collections
Topic: The filter() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#3
*/

class CookieVer3(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

// Create a list of Cookie objects
val cookiesVer3 = listOf(    // The type is inferred to be List<Cookie>
    CookieVer3(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    CookieVer3(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    CookieVer3(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    CookieVer3(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    CookieVer3(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    CookieVer3(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    CookieVer3(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

// ********************************************************************

// The forEach method signature is as follows: forEach(action: (T) -> Unit)
// Performs the given action on each element in the cookiesVer2 list.
fun main() {

    // forEach on a list
    cookiesVer3.forEach {
        println("Menu item: ${it.name}")
    }

    // ********************************************************************

    // use map() to transform a list into a new list
    val numberStr = listOf(8,6,7,5,3,0,9).map { it.toString() }
    println()
    numberStr.forEach {
        print(it)
    }
    println()

    // create a new list from a map of the cookiesVer3 list (list of CookiesVer3),
    // where the new list is a list of String
    val fullMenu = cookiesVer3.map {
        "${it.name} - $${it.price}"
    }

    println("\nFull menu:")
    fullMenu.forEach {
        println(it)
    }

    // ********************************************************************

    // create a filtered list from the existing list of CookieVer3 based on truth (predicate)
    val softBakedMenu = cookiesVer3.filter {
        it.softBaked  // equivalent to it.softBaked == true so has value true or false
    }

    println("\nSoft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    // ********************************************************************
}

