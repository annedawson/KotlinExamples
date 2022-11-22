/*
Date: Tuesday 22nd November 2022, 10:47 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #6 - Foldable Phones
File: P6FoldablePhones.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#6
STATUS: COMPLETED

Program requirements:

Typically, a phone screen turns on and off when the power button is pressed.
In contrast, if a foldable phone is folded, the main inner screen on a foldable phone
doesn't turn on when the power button is pressed.

In the initial code provided in the following code snippet,
write a FoldablePhone class that inherits from the Phone class.

It should contain the following:

A property that indicates whether the phone is folded.
A different switchOn() function behavior than the Phone class
so that it only turns the screen on when the phone isn't folded.
Methods to change the folding state.

The official solution is at the bottom of this page.
I added extra code in my solution to help me understand what was going on.

*/


// READ ALL THE FOLLOWING COMMENTS CAREFULLY

// In IntelliJ you can hover over any variable or class to get more information
// It will, for example, identify if an item is a constructor or a function,
// a parameter or a property, etc.

// *************************************************************************

// If you declare a class with an initial default value for a property
// then you can do this:  val testPhone = Phone()
// You don't need to pass anything to the constructor.
// See what happens if you use the following line instead:
//open class Phone(var isScreenLightOn: Boolean){
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    println("testPhone0")
    val testPhone0 = Phone()
    testPhone0.checkPhoneScreenLight()
    println()
    println("testPhone1")
    val testPhone1 = Phone(false)
    testPhone1.checkPhoneScreenLight()
    testPhone1.switchOn()
    testPhone1.checkPhoneScreenLight()
    println()
    println("testPhone2")
    val testPhone2 = Phone(true)
    testPhone2.checkPhoneScreenLight()
    testPhone2.switchOn()
    testPhone2.checkPhoneScreenLight()
    testPhone2.switchOff()
    testPhone2.checkPhoneScreenLight()
    println()
    println("newFoldablePhone1")
    val newFoldablePhone1 = FoldablePhone()
    newFoldablePhone1.checkPhoneScreenLight()
    newFoldablePhone1.switchOn()
    newFoldablePhone1.checkPhoneScreenLight()
    newFoldablePhone1.fold()
    newFoldablePhone1.checkPhoneScreenLight()
    newFoldablePhone1.unfold()
    newFoldablePhone1.switchOn()
    newFoldablePhone1.checkPhoneScreenLight()
    newFoldablePhone1.switchOff()
    newFoldablePhone1.checkPhoneScreenLight()
    println()
    println("newFoldablePhone2")
    val newFoldablePhone2 = FoldablePhone(false)
    newFoldablePhone2.checkPhoneScreenLight()
    newFoldablePhone2.switchOn()
    newFoldablePhone2.checkPhoneScreenLight()
    newFoldablePhone2.switchOff()
    newFoldablePhone2.checkPhoneScreenLight()

}

// Official solution from:
// https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#8

/*
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if(isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}
 */