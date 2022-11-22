/*
Date: Sunday 20th November 2022, 10:54 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #2 - Movie Ticket Price
File: P2MovieTicketPrice.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#2
STATUS: COMPLETED  (official solution at the bottom)
*/

/*
Program requirements:

    A children's ticket price of $15 for people 12 years old or younger.

    A standard ticket price of $30 for people between 13 and 60 years old.
    On Mondays, discount the standard ticket price to $25 for this same age group.

    A senior ticket price of $20 for people 61 years old and older.
    Assume that the maximum age of a moviegoer is 100 years old.

     A -1 value to indicate that the price is invalid
     when a user inputs an age outside of the age specifications.
     
*/

fun main() {

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    var price : Int = 0

    when (age){
        in 0..12 -> price = 15
        in 13..60 -> {
            if (isMonday) price = 25
            else price = 30
        }
        in 61..100 -> price = 20
        else -> price = -1
    }
    return price
}

// The output:

/*
The movie ticket price for a person aged 5 is  $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.
*/


/*
The official solution follows:

  fun ticketPrice(age: Int, isMonday: Boolean): Int {
      return when(age) {
          in 0..12 -> 15
          in 13..60 -> if (isMonday) 25 else 30
          in 61..100 -> 20
          else -> -1
      }
  }
  
 */