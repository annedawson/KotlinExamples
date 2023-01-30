/*
Date: Sunday 29th January 2023, 11:53 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnumsDataclassesSingletonobject.kt
Codelab title: Generics, objects, and extensions
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#4
*/

data class QuestionVer3<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class Quiz {
    val question1 = QuestionVer3("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionVer3<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionVer3<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    // note that the explicit <type arguments> can be removed as they can be derived from the values
    // e.g.   val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    // these questions will be used in a later program file.

    // note object can be used outside or inside a class,
    // but when inside, add the companion keyword
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }
}

/*
// this class has already been defined elsewhere
enum class Difficulty {
    EASY, MEDIUM, HARD
}
 */

fun main() {
    // question declarations moved to Quiz
    println("${Quiz.answered} of ${Quiz.total} answered.")
}