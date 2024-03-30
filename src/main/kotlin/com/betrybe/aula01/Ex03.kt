package com.betrybe.aula01

fun main() {
    println("IMC calculator")

    print("Enter your weight in kilos: ")
    val weight: Double = readln().toDouble()

    print("Enter your height in meters: ")
    val height: Double = readln().toDouble()

    print("Your IMC is: ${calIMC(weight, height)}")
}

fun calIMC(weight: Double, height: Double): Double = (weight / (height * height))