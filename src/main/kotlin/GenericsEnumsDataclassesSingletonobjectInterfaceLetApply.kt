/*
Date: Monday 30th January 2023, 10:53 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: GenericsEnumsDataclassesSingletonobjectInterfaceLetApply.kt
Codelab title: Generics, objects, and extensions
Topic: Scope functions let() and apply()
https://developer.android.com/codelabs/basic-android-kotlin-compose-generics?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-generics#7
*/

data class QuestionVer6<T>(
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

interface ProgressPrintableVer2 {
    val progressText: String
    fun printProgressBar()
}


class QuizVer4: ProgressPrintableVer2 {
    val question1 = QuestionVer6("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = QuestionVer6<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = QuestionVer6<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    // note that the explicit <type arguments> can be removed as they can be derived from the values
    // e.g.   val question1 = Question("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)

    // note object can be used outside or inside a class,
    // but when inside, add the companion keyword
    companion object StudentProgress {
        var total: Int = 10
        var answered: Int = 3
    }

    override val progressText: String  // overriding interface progressText
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {  // overriding interface printProgressBar()
        repeat(QuizVer4.answered) { print("▓") }
        repeat(QuizVer4.total - QuizVer4.answered) { print("▒") }
        println()
        println(progressText)
    }

/*
    fun printQuiz() {
        println(question1.questionText)
        println(question1.answer)
        println(question1.difficulty)
        println()
        println(question2.questionText)
        println(question2.answer)
        println(question2.difficulty)
        println()
        println(question3.questionText)
        println(question3.answer)
        println(question3.difficulty)
        println()
    }
*/

    fun printQuiz() {
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }

}

/*
// this class has already been defined elsewhere
enum class Difficulty {
    EASY, MEDIUM, HARD
}
 */

fun main() {
    QuizVer4().printProgressBar()
    println()
    val quiz = QuizVer4()
    quiz.printQuiz()

    QuizVer4().apply{
        printQuiz()
    }
}