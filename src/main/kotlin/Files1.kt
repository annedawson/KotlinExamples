import java.io.File
import kotlin.io.*


/*
Date: Sunday 5th February 2023, 13:52 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Example Kotlin Code
File: Files1.kt
Topic: How to read a text file into a list of String
       then process that list.
*/

/*
Create words.txt in /home/anne
Ubuntu Linux terminal:
cat /usr/share/dict/words > words.txt
*/

fun main() {

    val fileName = "//home//anne//words.txt"
    val lines: List<String> = File(fileName).readLines() // returns a list of String
    val resultsList = mutableListOf<String>()
    val characterQuote = '\''  // Here I use an escape character to specify an apostrophe quote mark (')
    print("\n\nEnter characters: ")
    val searchString = readLine()
    println("\nSearch for: $searchString")
    lines.forEach {
        /*if (it.compareTo("discs") == 0)  // strings are identical
            println(it)*/
        if (it.contains(searchString.toString(), ignoreCase = true)) {
            //println(it)
            if (!(it.contains(characterQuote))) // if the string does NOT contain a quote mark (')
                resultsList.add(it)              // add the string to the results list
        }
    }

    println("\nResults List\n")
    if (resultsList.size != 0) {
        println(resultsList)
        val longest = resultsList.maxBy { it.length }
        println("\nLongest word is: " + longest + " with ${longest.length} characters" )
        //val shortest = resultsList.minBy { it.length }
        //println(shortest)
    } else
        println("No words found.")
}
