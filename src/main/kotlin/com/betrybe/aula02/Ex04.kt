package com.betrybe.aula02
import com.betrybe.aula01.runAverage
fun main() {
    print("Enter your first grade: ")
    val grade1: Double = readln().toDouble()

    print("Enter your second grade: ")
    val grade2: Double = readln().toDouble()

    print("Enter your third grade: ")
    val grade3: Double = readln().toDouble()

    val average = runAverage(grade1, grade2, grade3)

    println("Your average was $average.")

    if (average < 3) {
        return println("FAIL")
    }

    if (average < 7) {
        return println("RETAKE TEST")
    }

    return println("APPROVED")
}
