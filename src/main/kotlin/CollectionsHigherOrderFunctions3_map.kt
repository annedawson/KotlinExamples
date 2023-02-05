/*
Date: Wednesday 1st February 2023, 11:24 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsHigherOrderFunctions3_map.kt
Codelab title: Higher-order functions with collections
Topic: The map() function
https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-higher-order-functions#2
*/

class CookieVer2(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

// Create a list of Cookie objects
val cookiesVer2 = listOf(    // The type is inferred to be List<Cookie>
    CookieVer2(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    CookieVer2(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    CookieVer2(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    CookieVer2(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    CookieVer2(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    CookieVer2(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    CookieVer2(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)


// The forEach method signature is as follows: forEach(action: (T) -> Unit)
// Performs the given action on each element in the cookiesVer2 list.
fun main() {

    // forEach on a list
    cookiesVer2.forEach {
        println("Menu item: ${it.name}")
    }

    // use map() to transform a list into a new list
    val numberStr = listOf(8,6,7,5,3,0,9).map { it.toString() }
    numberStr.forEach {
        print(it)
    }
    println()

    // create a new list from a map of the cookiesVer2 list (list of Cookies),
    // where the new list is a list of String
    val fullMenu = cookiesVer2.map {
        "${it.name} - $${it.price}"
    }

    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}

