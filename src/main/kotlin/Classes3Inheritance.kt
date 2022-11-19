
/*
Date: Friday 11th November 2022, 12:12 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: Classes3Inheritance.kt
Codelab title: Use classes and objects in Kotlin
https://developer.android.com/codelabs/basic-android-kotlin-compose-classes-and-objects?authuser=1&continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%3Fauthuser%3D1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-classes-and-objects#0
Section 7 - Implement a relationship between classes (Inheritance and Containment/Composition)
STATUS: COMPLETED
 */


fun main(){
    /*
    val smartTvDevice = SmartDevice3(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
    */

    // you can declare an object of a superclass then assign a subclass value, as shown below...
    // thereafter you can assign an object of any subclass to the variable smartDevice
    // so smartDevice may be referring to a TV or a Light or whatever, see POLYMORPHISM
    var smartDevice: SmartDevice3 = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    // or you can declare an object of the same class as the value assigned, as shown below

    var smartTv1Device: SmartTvDevice = SmartTvDevice("TV1", "Entertainment")
    smartTv1Device.turnOff()

    // In the line above, looked at the greyed out class SmartTvDevice.
    // The reason it's greyed out is because it is redundant here.
    // It represents the data type, just like SmartDevice3 is the data type of smartDevice
    // but here the data type is redundant as it is the same as that of the value assigned

    var smartTv2Device = SmartTvDevice("TV2", "Entertainment")
    smartTv2Device.turnOn()

    // deviceName and deviceCategory of SmartTvDevice
    // doesn't specify val or var, so they are just parameters used only for the superclass constructor -
    // they are not properties of the SmartTvDevice class. You cannot use them in the class.

    // compare the above to a simple declaration:
    // var count: Int = 10
    // smartDevice is of type SmartDevice3 and is assigned the value SmartTvDevice(...)
    // we can do this because, just like a Student which extends Person, we can say that a Student
    // IS-A Person, so we can assign a subclass value to a superclass object
    // a student could be used wherever a person was expected

    // IMPORTANT - see page 261 of Head First Kotlin

    println("Device name is: ${smartDevice.name}")
    smartDevice.turnOn()
   // smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()

}


// open means extensible - means you can inherit from this class
open class SmartDevice3(val name: String, val category: String) {
    // first two properties (preceded by val) moved to constructor parameters
    // instead of in the body with the other properties

    // Visibility modifiers for constructors:
    // if you want to add protected modifier to SmartDevice3, do this:
    // open class SmartDevice3 protected constructor (val name: String, val category: String) {

    /*
    var deviceStatus = "online"
        protected set(value){
            field = value
        } // the third property
     */

    // You can omit the parentheses and body of the set() function to get:

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    // methods
    // open here means can be overridden in a subclass
    open fun turnOn(){
        deviceStatus = "on"
    }

    open fun turnOff(){
        deviceStatus = "off"
    }
}

// deviceName and deviceCategory of SmartTvDevice
// doesn't specify val or var, so they are just parameters used only for the superclass constructor -
// they are not properties of the SmartTvDevice class. You cannot use them in the class.

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice3(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }
    private var channelNumber = 1
        set(value) {
            if (value in 0..200) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        println("Smart TV turned on. Speaker volume set to $speakerVolume.")
    }

    override fun turnOff() {
        super.turnOff()
        println("Smart TV turned off")}

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }


}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice3(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }


    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 2
        println("Smart Light turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }
}


// The SmartHome class HAS-A smart TV device.
class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }

}

