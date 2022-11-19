/*
Date: Friday 11th November 2022, 12:07 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: Classes4InheritanceAbstract.kt
Codelab title: Classes and inheritance in Kotlin
https://developer.android.com/codelabs/basic-android-kotlin-training-classes-and-inheritance#0
STATUS: COMPLETED
Solution code fully commented/documented is here:
https://developer.android.com/codelabs/basic-android-kotlin-training-classes-and-inheritance#5
 */



/*
fun main() {
    val squareCabin = SquareCabin(6)

    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
}
 */

// This main function is better

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {
    val squareCabin = SquareCabin(6, 50.0)
    //val squareCabin = SquareCabin(6)
    val roundHut = RoundHut(3, 10.0)
    //val roundHut = RoundHut(3)
    //val roundTower = RoundTower(4)
    val roundTower = RoundTower(4, 15.5)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
    }

    with(roundHut) {
        println("\nRound Hut\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        //println("Carpet Length: ${calculateMaxCarpetLength()}")
        println("Carpet Length: %.2f".format(calculateMaxCarpetLength()))

    }

    with(roundTower) {
        println("\nRound Tower\n==========")
        println("Material: ${buildingMaterial}")
        println("Capacity: ${capacity}")
        println("Has room? ${hasRoom()}")
        //println("Floor area: ${floorArea()}")
        println("Floor area: %.2f".format(floorArea()))
        //println("Carpet Length: ${calculateMaxCarpetLength()}")
        println("Carpet Length: %.2f".format(calculateMaxCarpetLength()))
    }
}


// an abstract class cannot be instantiated - can only be used for inheritance
// private means can only be used in this class
abstract class Dwelling(private var residents: Int) {

    abstract val buildingMaterial: String  // abstract means that it will be defined
                                           // or given a value at a later time by the child
    abstract val capacity: Int  // all dwellings have a capacity, but it has to be defined by child
                                // and for each actual dwelling, it will be a different value

    // this class has 3 properties, residents is passed in.
    // The var in the constructor means that this variable is a property of this class.


    // The formula for calculating whether there is room is the same for all dwellings.
    // This function can be executed by any type of dwelling.
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    abstract fun floorArea(): Double
    // Before you can run your code, you need to implement floorArea() in the subclasses.

    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no rooms left.")
        }
    }
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
//class SquareCabin(residents: Int) : Dwelling(residents) {
    override val buildingMaterial = "Wood"
    override val capacity = 6

    override fun floorArea(): Double {
        return length * length
    }
}

open class RoundHut(
    residents: Int,
    val radius: Double) : Dwelling(residents) {
    override val buildingMaterial = "Straw"
    override val capacity = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetLength(): Double {

        return sqrt(2.0) * radius
    }

}

class RoundTower(
    residents: Int,
    radius: Double,
    val floors: Int = 2) : RoundHut(residents, radius) {
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    override fun floorArea(): Double {
        return super.floorArea() * floors
    }
}
