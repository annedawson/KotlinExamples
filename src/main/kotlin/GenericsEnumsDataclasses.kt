/*
Date: Sunday 29th January 2023, 10:30 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnumsDataclasses.kt
Codelab title: Generics, objects, and extensions
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#3
 */

data class QuestionVer2<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)


/*
// this class has already been defined elsewhere
enum class Difficulty {
    EASY, MEDIUM, HARD
}
 */

fun main() {
    val question1 = QuestionVer2("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionVer2<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionVer2<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    // note that the explicit <type arguments> can be removed as they can be derived from the values
    // e.g.   val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    // toString() not implemented for a regular class
    // or a generic class, but IS implemented for a data class
    println(question1.toString())
    println("___________________________")
    println(question1.questionText)
    println(question1.answer)
    println(question1.difficulty)
    println(question2.questionText)
    println(question2.answer)
    println(question2.difficulty)
    println(question3.questionText)
    println(question3.answer)
    println(question3.difficulty)
}