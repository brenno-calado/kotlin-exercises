package com.betrybe.aula01

fun main() {
    println("Arithmetic average calculator")

    print("Enter the first number: ")
    val firstNumber: Int = readln().toInt()
    println("Entered number: $firstNumber")

    print("Enter the second number: ")
    val secondNumber: Int = readln().toInt()
    println("Entered number: $secondNumber")

    print("Enter the third number: ")
    val thirdNumber: Int = readln().toInt()
    println("Entered number: $thirdNumber")

    println("The arithmetic average is: ${runAverage(firstNumber, secondNumber, thirdNumber)}")
}

fun runAverage(vararg numbers: Double) = numbers.sum() / numbers.size
fun runAverage(vararg numbers: Int) = numbers.sum() / numbers.size