/*
Date: Tuesday 31st January 2023, 13:31 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: CollectionsSetsMaps.kt
Codelab title: Collections in Kotlin
Topic: Sets and Maps
https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-collections#3
https://developer.android.com/codelabs/basic-android-kotlin-compose-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-collections#4
*/

fun main() {
    // the benefit of sets is uniqueness and speed of searching, especially large amounts of data
    println("\n\nSets ---------------------------------------------------------------------------------------------\n")
    println("Sets are implemented using hash code values...")
    println("Hash code values for the strings  'Kotlin' and 'Kotlin!': ")
    println("Kotlin".hashCode())  // hashCode() returns an Int
    println("Kotlin!".hashCode())

    /*
    Kotlin documentation on hashCode():

    Returns a hash code value for the object.
    The general contract of hashCode is:
    Whenever it is invoked on the same object more than once,
    the hashCode method must consistently return the same integer,
    provided no information used in equals comparisons on the object is modified.
    If two objects are equal according to the equals() method,
    then calling the hashCode method on each of the two objects
    must produce the same integer result.

    Sets ---------------------------------------------------------------------------------------------

Hashcodes for 'Kotlin' and 'Kotlin!':
-2041707231
1131585312

Process finished with exit code 0
*/
    // This returns a MutableSet, the default implementation of which is LinkedHashSet().
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    for (planet in solarSystem) {  // Elements of the set are iterated in the order they were specified.
        println(planet)
    }
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))

    println("\n\nMaps ---------------------------------------------------------------------------------------------\n")


    val solarSystemVer2 = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    println(solarSystemVer2.size)
    solarSystemVer2["Pluto"] = 5
    println(solarSystemVer2.size)
    // You can use subscript syntax to get a value. Print the number of moons for the key "Pluto".
    println(solarSystemVer2["Pluto"])
    println(solarSystemVer2["Theia"])
    solarSystemVer2.remove("Pluto")
    println(solarSystemVer2.size)
    solarSystemVer2["Jupiter"] = 78
    println(solarSystemVer2["Jupiter"])

}