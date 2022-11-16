/*
Date: Monday 7th November 2022, 10:25 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: Classes_1.kt
Codelab title: Use classes and objects in Kotlin
https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#0
Section 5 - Define Class Properties
 */

// class SmartDevice constructor() {
class SmartDevice {
    // properties
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    // methods
    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main(){
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}