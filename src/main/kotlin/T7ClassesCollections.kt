/*
Date: Tuesday 14th February 2023, 15:02 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: T7ClassesCollections.kt
Codelab title: Practice: Classes and Collections
Topic: Task 7 -  add an extension property to the data class
https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#9
*/


data class EventVer7(
    val title: String,
    val description: String? = null,
    val daypart:DaypartVer7,
    val duration: Int
)

// Extension property for Task 7
val EventVer7.durationOfEvent1: Int
    get() = duration // Note: Extension properties can't store data, so they must be get-only.

// https://developer.android.com/codelabs/basic-android-kotlin-compose-practice-classes-and-collections?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-practice-classes-and-collections#9
// see file: GenericsEnumsDataclassesSingletonobjectExtend.kt
// https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#5

// Extension property for Task 7
val EventVer7.durationOfEvent2: String
    get() = if (this.duration < 60) {
        "short"
    } else {
        "long"
    }

enum class DaypartVer7 {
    MORNING, AFTERNOON, EVENING
}

fun main() {
    val eventsList = mutableListOf(
        EventVer7(title = "Wake up", description = "Time to get up", daypart = DaypartVer7.MORNING, duration = 0),
        EventVer7(title = "Eat breakfast", daypart = DaypartVer7.MORNING, duration = 15),
        EventVer7(title = "Learn about Kotlin", daypart = DaypartVer7.AFTERNOON, duration = 30),
        EventVer7(title = "Practice Compose", daypart = DaypartVer7.AFTERNOON, duration = 60),
        EventVer7(title = "Watch latest DevBytes video", daypart = DaypartVer7.AFTERNOON, duration = 10),
        EventVer7(title = "Check out latest Android Jetpack library", daypart = DaypartVer7.EVENING, duration = 45)
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

    // https://kotlinlang.org/docs/extensions.html
    // using the extension property durationOfEvent1 defined under the EventVer7 class definition
    println("Duration of first event of the day: ${eventsList[0].durationOfEvent1}")
    println("Duration of last event of the day: ${eventsList[eventsList.size - 1].durationOfEvent1}")
    // using the extension property durationOfEvent2 defined under the EventVer7 class definition
    println("Duration of first event of the day: ${eventsList[0].durationOfEvent2}")
    println("Duration of fourth event of the day: ${eventsList[3].durationOfEvent2}")

}