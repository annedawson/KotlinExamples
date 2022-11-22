/*
Date: Sunday 20th November 2022, 13:14 PT
Programmer: Anne Dawson
Email: anne.dawson@gmail.com
Purpose: Practice Problem #3 - Temperature Converter
File: P3TemperatureConverter.kt
Codelab title: Practice:Kotlin Fundamentals
Ref: Unit 2/5, Pathway 1/3, Section 5/7
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-1%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-kotlin-fundamentals-practice-problems#3
STATUS: COMPLETED  (official solution is the working solution)

Program requirements:  Complete main(), the remaining code is used as is.

use formulas:

 Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
 Kelvin to Celsius: ° C = K - 273.15
 Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

to output:

27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.

 */



fun main() {
    // printFinalTemperature(1.0,"C","F", {10.0})
    // printFinalTemperature(27.0,"Celsius","Fahrenheit") { 10.0 }  // trailing lamdba format
    // the above works with a dummy value in the lambda
    // printFinalTemperature(27.0,"Celsius","Fahrenheit") { 10.0 }
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }

    // Remember that 'it' is the name given to the single argument sent to the lambda.
    // The lambda returns the result of the last expression, in this case there is only one expression.
    // The lambda receives and returns a Double.
}



fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
    // conversionFormula is of type function, and contains *** the function code *** .
    // To run the function code you need to invoke it using the parenthese ()
    // sending across any required arguments
    // this lambda receives a Double and returns a Double
    // and is called here using: conversionFormula(initialMeasurement)
) {
    // the conversionFormula lambda receives a single double parameter - so we can call it 'it' in lambda
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}