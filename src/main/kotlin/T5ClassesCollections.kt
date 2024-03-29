/*
Date: Tuesday 14th February 2023, 10:49 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T5ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 5 -  group the list by daypart, then print the number of events for each daypart
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#7
*/


data class EventVer5(
    val title: String,
    val description: String? = null,
    val daypart:DaypartVer5,
    val duration: Int
)

enum class DaypartVer5 {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val eventsList = mutableListOf(
        EventVer5(title = "Wake up", description = "Time to get up", daypart = DaypartVer5.MORNING, duration = 0),
        EventVer5(title = "Eat breakfast", daypart = DaypartVer5.MORNING, duration = 15),
        EventVer5(title = "Learn about Kotlin", daypart = DaypartVer5.AFTERNOON, duration = 30),
        EventVer5(title = "Practice Compose", daypart = DaypartVer5.AFTERNOON, duration = 60),
        EventVer5(title = "Watch latest DevBytes video", daypart = DaypartVer5.AFTERNOON, duration = 10),
        EventVer5(title = "Check out latest Android Jetpack library", daypart = DaypartVer5.EVENING, duration = 45)
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

    // see official solution below
    val morningList = groupedList[DaypartVer5.MORNING] ?: listOf()
    val afternoonList = groupedList[DaypartVer5.AFTERNOON] ?: listOf()
    val eveningList = groupedList[DaypartVer5.EVENING] ?: listOf()

    println("\nMorning")
    morningList.forEach {
        println(it.title)
    }
    println("\nAfternoon")
    afternoonList.forEach {
        println(it.title)
    }
    println("\nEvening")
    eveningList.forEach {
        println(it.title)
    }

    println("\nMorning ${morningList.size}")
    println("Afternoon ${afternoonList.size}")
    println("Evening ${eveningList.size}")

    // official solution:

    groupedList.forEach { (daypart, eventsList) ->
        println("$daypart: ${eventsList.size} events")
    }
}
