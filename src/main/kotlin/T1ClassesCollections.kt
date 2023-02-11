/*
Date: Saturday 11th February 2023, 9:34 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T1ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 1 make and test a data class
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#2
*/

data class Event(
    val title: String,
    val description: String? = null, // My solution is identical to this solution except that I had omitted the = null part.
    val daypart:String,
    val duration: Int
)

fun main() {
    val event1 = Event("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.\n","Evening",15)
    // toString() not implemented for a regular class
    // or a generic class, but IS implemented for a data class
    println(event1.toString())
}
