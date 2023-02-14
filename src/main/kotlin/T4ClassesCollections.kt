/*
Date: Tuesday 14th February 2023, 8:48 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T4ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 4 -  display only short events (duration < 50)
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#6
*/


data class Event_Ver4(
    val title: String,
    val description: String? = null,
    val daypart:Daypart_Ver4,
    val duration: Int
)

enum class Daypart_Ver4 {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val eventsList = mutableListOf(
        Event_Ver4(title = "Wake up", description = "Time to get up", daypart = Daypart_Ver4.MORNING, duration = 0),
        Event_Ver4(title = "Eat breakfast", daypart = Daypart_Ver4.MORNING, duration = 15),
        Event_Ver4(title = "Learn about Kotlin", daypart = Daypart_Ver4.AFTERNOON, duration = 30),
        Event_Ver4(title = "Practice Compose", daypart = Daypart_Ver4.AFTERNOON, duration = 60),
        Event_Ver4(title = "Watch latest DevBytes video", daypart = Daypart_Ver4.AFTERNOON, duration = 10),
        Event_Ver4(title = "Check out latest Android Jetpack library", daypart = Daypart_Ver4.EVENING, duration = 45)
    )
    // Note that the official solution assigns each event to a separate variable,
    // then makes the list from those:
    // val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    // val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    eventsList.forEach {
        println("Event: ${it.title} ${it.description}")
    }

    // ********************************************************************

    // create a filtered list from the existing list of CookieVer3 based on truth (predicate)
    val shortEventsList = eventsList.filter {
        it.duration < 50
    }

    println("\nShort events")
    shortEventsList.forEach {
        println("Event: ${it.title} Duration:  ${it.duration}")
    }

    // ********************************************************************
}
