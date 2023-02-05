/*
Date: Tuesday 31st January 2023, 9:32 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsArraysLists.kt
Codelab title: Collections in Kotlin
Topic: Arrays and Lists
https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-collections
*/

fun main() {

    println("\n\nArray ---------------------------------------------------------------------------------------------\n")

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")  // <String> is optional
    val solarSystem = rockPlanets + gasPlanets
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])

    solarSystem[3] = "Little Earth"  // you can change the value of an element, but not the **size** of the array
    println(solarSystem[3])

    println(solarSystem.size)
    println(solarSystem.indexOf("Earth"))

    println("\n\nList  ---------------------------------------------------------------------------------------------\n")

    // a list
    val solarSystemVer2 = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystemVer2.size)
    println(solarSystemVer2[2])
    println(solarSystemVer2.get(3))
    println(solarSystemVer2.indexOf("Earth"))
    println(solarSystemVer2.indexOf("Moon"))  // prints -1 if the value does not exist in the list
    for (planet in solarSystemVer2) {     // the variable name planet could be any name, often e.g. item, element
        println(planet)                   // the variable name is read only so no need to use val or var
    }

    println("\n\nMutable List  -------------------------------------------------------------------------------------\n")
    // a mutable list
    val solarSystemVer3 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    // we can add and delete items of a mutable list
    solarSystemVer3.add("Pluto")   // note you cannot use add() with a list which is immutable (cannot change the size)
    for (planet in solarSystemVer3) {     // the variable name planet could be any name, often e.g. item, element
        println(planet)                   // the variable name is read only so no need to use val or var
    }
    println("\n\n")
    solarSystemVer3.add(3, "Theia")  // Puts Theia at index 3, pushing the rest over
    for (planet in solarSystemVer3) {
        println(planet)
    }
    println("\nAfter removing elements:\n")
    solarSystemVer3.removeAt(9)
    solarSystemVer3.remove("Theia")
    for (planet in solarSystemVer3) {
        println(planet)
    }
    println("\nChecking for containment of elements:\n")
    println(solarSystemVer3.contains("Pluto"))
    println("Pluto" in solarSystemVer3)
    println("Mars" in solarSystemVer3)

}

