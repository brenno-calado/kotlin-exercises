package com.betrybe.aula01

fun main() {
    print("Enter your base salary: ")
    val salary = readln().toDouble()
    val netSalary = getNetSalary(salary)

    println("Your net salary is: $netSalary")
}

fun getNetSalary(salary: Double, bonus: Double = 0.05, tax: Double = 0.07): Double = (salary + (salary * bonus))  - (salary * tax)
