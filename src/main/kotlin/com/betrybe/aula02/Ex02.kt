package com.betrybe.aula02

fun main() {
    println("Stairs to climb calculator")

    print("Enter the desired height you want to climb in meters: ")
    val height: Double = readln().toDouble()

    print("Enter the height one ladder step has in meters: ")
    val ladderStepHeight: Double = readln().toDouble()
    val stepsToClimb = getStepsToClimb(height, ladderStepHeight)
    println("You need to climb $stepsToClimb steps in order to reach $height meters")
}

fun getStepsToClimb(height: Double, stepHeight: Double): Int = (height / stepHeight).toInt()