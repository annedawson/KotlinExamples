/*
Date: Sunday 29th January 2023, 15:23 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnumsDataclassesSingletonobjectInterface.kt
Codelab title: Generics, objects, and extensions
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#6
*/

data class QuestionVer5<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

interface ProgressPrintable {
    val progressText: String
    fun printProgressBar()
}


class QuizVer3: ProgressPrintable {
    val question1 = QuestionVer5("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionVer5<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionVer5<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    // note that the explicit <type arguments> can be removed as they can be derived from the values
    // e.g.   val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    // these questions will be used in a later program file.

    // note object can be used outside or inside a class,
    // but when inside, add the companion keyword
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String  // overriding interface progressText
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {  // overriding interface printProgressBar()
        repeat(QuizVer3.answered) { print("▓") }
        repeat(QuizVer3.total - QuizVer3.answered) { print("▒") }
        println()
        println(progressText)
    }
}





/*
// this class has already been defined elsewhere
enum class Difficulty {
    EASY, MEDIUM, HARD
}
 */

fun main() {
    QuizVer3().printProgressBar()
}