/*
Date: Sunday 29th January 2023, 14:37 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnumsDataclassesSingletonobjectExtend.kt
Codelab title: Generics, objects, and extensions
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#5
*/

data class QuestionVer4<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

class QuizVer2 {
    val question1 = QuestionVer4("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionVer4<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionVer4<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
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


// Extension property
val QuizVer2.StudentProgress.progressText: String
    get() = "${answered} of ${total} answered" // Note: Extension properties can't store data, so they must be get-only.

// Extension function
fun QuizVer2.StudentProgress.printProgressBar() {
    repeat(QuizVer2.answered) { print("▓") }
    repeat(QuizVer2.total - QuizVer2.answered) { print("▒") }
    println()
    println(QuizVer2.progressText)
}

/*
// this class has already been defined elsewhere
enum class Difficulty {
    EASY, MEDIUM, HARD
}
 */

fun main() {
    // question declarations moved to Quiz
    println(QuizVer2.progressText)  // with extension property much cleaner
    println("${QuizVer2.answered} of ${QuizVer2.total} answered.") // without extension property
    println()
    QuizVer2.printProgressBar()  // extension function call
}