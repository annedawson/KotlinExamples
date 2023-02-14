/*
Date: Tuesday 14th February 2023, 8:33 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T3ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 3 -
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#5
*/


data class Event_Ver3(
    val title: String,
    val description: String? = null,
    val daypart:Daypart_Ver3,
    val duration: Int
)

enum class Daypart_Ver3 {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val event3 = Event_Ver3("Study Kotlin", "Commit to studying Kotlin at least 15 minutes per day.\n", Daypart_Ver3.EVENING,15)
    // toString() not implemented for a regular class
    // or a generic class, but IS implemented for a data class
    println(event3.toString())

    val eventsList = mutableListOf(
        Event_Ver3(title = "Wake up", description = "Time to get up", daypart = Daypart_Ver3.MORNING, duration = 0),
        Event_Ver3(title = "Eat breakfast", daypart = Daypart_Ver3.MORNING, duration = 15),
        Event_Ver3(title = "Learn about Kotlin", daypart = Daypart_Ver3.AFTERNOON, duration = 30),
        Event_Ver3(title = "Practice Compose", daypart = Daypart_Ver3.AFTERNOON, duration = 60),
        Event_Ver3(title = "Watch latest DevBytes video", daypart = Daypart_Ver3.AFTERNOON, duration = 10),
        Event_Ver3(title = "Check out latest Android Jetpack library", daypart = Daypart_Ver3.EVENING, duration = 45)
    )
    // Note that the official solution assigns each ec=vent to a separate variable,
    // then makes the list from those:
    // val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    // val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    eventsList.forEach {
        println("Event: ${it.title} ${it.description}")
    }
}
