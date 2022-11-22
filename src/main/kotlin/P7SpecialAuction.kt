/*
Date: Tuesday 22nd November 2022, 10:53 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #7 (of 7)- Special Auction
File: P7SpecialAuction.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#7
STATUS: COMPLETED

Program requirements:

Typically in an auction, the highest bidder determines the price of an item.
In this special auction, if there's no bidder for an item,
the item is automatically sold to the auction house at the minimum price.

In the initial code provided in the following code snippet,
you're given an auctionPrice() function that accepts
a nullable Bid? type as an argument.

Complete the auctionPrice() function so that the program prints these lines:


Item A is sold at 5000.
Item B is sold at 3000.

 */

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    if (bid == null)
        return minimumPrice
    else
        return bid.amount
}

// The official solution uses a safe call and the ?. Elvis operator to return the correct price:

/*
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}

however my code worked fine, so I'll sacrifice the brevity
 */