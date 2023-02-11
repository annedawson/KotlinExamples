/*
Date: Saturday 28th January 2023, 8:20 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnums.kt
Codelab title: Generics, objects, and extensions
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#0Section 5 - Define Class Properties
 */

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty {
    EASY, MEDIUM, HARD
}


fun main() {
    val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    // note that the explicit <type arguments> can be removed as they can be derived from the values
    // e.g.   val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    println(question1.questionText)
    //println(question1.toString())
    // toString() not implemented for a regular class
    // or a generic class, but is implemented for a data class
    println(question1.answer)
    println(question1.difficulty)
    println(question2.questionText)
    println(question2.answer)
    println(question2.difficulty)
    println(question3.questionText)
    println(question3.answer)
    println(question3.difficulty)
}