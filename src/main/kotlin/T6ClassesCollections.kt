/*
Date: Tuesday 14th February 2023, 12:16 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T6ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 6 -  Print the title of the last event in the list using the index & by list method
https://kotlinlang.org/docs/collection-elements.html#retrieve-by-position
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#8
*/


data class EventVer6(
    val title: String,
    val description: String? = null,
    val daypart:DaypartVer6,
    val duration: Int
)

enum class DaypartVer6 {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val eventsList = mutableListOf(
        EventVer6(title = "Wake up", description = "Time to get up", daypart = DaypartVer6.MORNING, duration = 0),
        EventVer6(title = "Eat breakfast", daypart = DaypartVer6.MORNING, duration = 15),
        EventVer6(title = "Learn about Kotlin", daypart = DaypartVer6.AFTERNOON, duration = 30),
        EventVer6(title = "Practice Compose", daypart = DaypartVer6.AFTERNOON, duration = 60),
        EventVer6(title = "Watch latest DevBytes video", daypart = DaypartVer6.AFTERNOON, duration = 10),
        EventVer6(title = "Check out latest Android Jetpack library", daypart = DaypartVer6.EVENING, duration = 45)
    )
    // Note that the official solution assigns each event to a separate variable,
    // then makes the list from those:
    // val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
    // val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    eventsList.forEach {
        println("Event: ${it.title} ${it.description}")
    }

    // ********************************************************************

    // create a filtered list from the existing list based on truth (predicate)
    val shortEventsList = eventsList.filter {
        it.duration < 50
    }

    println("\nShort events")
    shortEventsList.forEach {
        println("Event: ${it.title} Duration:  ${it.duration}")
    }

    println("You have ${shortEventsList.size} short events.")

    // ********************************************************************

    val groupedList = eventsList.groupBy { it.daypart }

    groupedList.forEach { (daypart, eventsList) ->
        println("$daypart: ${eventsList.size} events")
    }

    println("Last event of the day: ${eventsList[eventsList.size - 1].title}")
    // https://kotlinlang.org/docs/collection-elements.html#retrieve-by-position
    println("Last event of the day: ${eventsList.last().title}")
}
