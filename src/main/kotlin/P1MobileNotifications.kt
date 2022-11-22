/*
Date: Saturday 19th November 2022, 13:25 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #1 - Mobile notifications
File: P1MobileNotifications.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#1
STATUS: COMPLETED  (official solution at the bottom)
*/

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    if ( numberOfMessages > 99 ){
        println("Your phone is blowing up! You have 99+ notifications.")
    }
    else{
        println("You have $numberOfMessages notifications.")
    }
}

// The official solution follows

/*


fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}


fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}


 */