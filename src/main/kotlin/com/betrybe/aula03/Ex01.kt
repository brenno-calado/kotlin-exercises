package com.betrybe.aula03

fun main() {
    val array1 = mutableListOf<Int>()
    val array2 = mutableListOf<Int>()
    val mergedArray = mutableListOf<Int>()

    for (i in 0 until 10) {
        print("Enter the value for index $i of array1: ")
        array1.add(readln().toInt())
    }

    for (i in 0 until 10) {
        print("Enter the value for index $i of array2: ")
        array2.add(readln().toInt())
    }

    array1.forEach { print("$it ") }
    println()
    array2.forEach { print("$it ") }
    println()

    var array1Index = 0
    var array2Index = 0
    for (i in 0 until array1.size + array2.size) {
        if (i % 2 == 0) {
            mergedArray.add(array1[array1Index])
            array1Index++
        } else {
            mergedArray.add(array2[array2Index])
            array2Index++
        }
    }

    mergedArray.forEach { print("$it ") }
}