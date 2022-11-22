/*
Date: Monday 21st November 2022, 13:45 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #4 - Song Catalog
File: P4SongCatalog.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#4
STATUS: COMPLETED

Program requirements:

Imagine that you need to create a music-player app.

Create a class that can represent the structure of a song.
The Song class must include these code elements:

Properties for the title, artist, year published, and play count
A property that indicates whether the song is popular.
If the play count is less than 1,000, consider it unpopular.
A method that prints a song description in this format:
"[Title], performed by [artist], was released in [year published]."

*/



class Song (val title: String, val artist: String, var yearPublished: Int, var playCount: Int){
    val isPopular: Boolean
        get() = playCount >= 1000   // isPopular is a calculated property (note the syntax)

    fun printDescription(){
        println("$title, performed by $artist, released in year $yearPublished ")
    }
}

fun main(){
    var mySong = Song("Yesterday","The Beatles",1965, 1001)
    mySong.printDescription()
    println(mySong.isPopular)
}

