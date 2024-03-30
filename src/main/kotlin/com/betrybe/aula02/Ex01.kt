package com.betrybe.aula02

fun main() {
    println("New Salary calculator")

    print("Enter your current salary: ")
    var salary: Double = readln().toDouble()

    salary = getNewSalary(salary)
    println("Your new salary is: ${salary}BRL. Good job!")
}

fun getNewSalary(oldSalary: Double): Double = oldSalary * 1.25