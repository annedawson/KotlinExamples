/*
Date: Sunday 12th February 2023, 10:16 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T2ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 2 - add an enum class
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#4
*/


data class Event_Ver2(
    val title: String,
    val description: String? = null,
    val daypart:Daypart,
    val duration: Int
)

enum class Daypart {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val event2 = Event_Ver2("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.\n", Daypart.EVENING,15)
    // toString() not implemented for a regular class
    // or a generic class, but IS implemented for a data class
    println(event2.toString())
}
