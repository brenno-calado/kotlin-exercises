package com.betrybe.aula02

fun main() {
    println("Which is greatest calculator")

    print("Enter the first number: ")
    val first: Double = readln().toDouble()

    print("Enter the second number: ")
    val second: Double = readln().toDouble()

    if (first == second) {
        return println("Both $first and $second are equal")
    }

    val greatest = if (first > second) first else second

    println("The greatest number is: $greatest.")
}