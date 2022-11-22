/*
Date: Monday 21st November 2022, 14:39 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #5 - Internet Profile
File: P5InternetProfile.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#5
STATUS: COMPLETED

Program requirements: Complete the showProfile() function so that the program prints these lines:

Name: Anne
Age: 45
Likes to write code. Doesn't have a referrer.

Name: Janet
Age: 44
Likes to write books. Has a referrer named Anne, who likes to write code.

*/

fun main() {

    val anne = Person("Anne", 45, "write code", null)
    val janet = Person("Janet", 44, "write books", anne)

    anne.showProfile()
    janet.showProfile()

}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        print("Likes to $hobby. ")
        if (referrer == null)
            println("Doesn't have a referrer.")
        else
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        println()
    }
}

// Comments on my own solution: I forgot that hobby was nullable.
// The solution code show the fix.

// SOLUTION CODE

/*

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if(hobby != null) {
            print("Likes to $hobby. ")
        }
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}


 */
