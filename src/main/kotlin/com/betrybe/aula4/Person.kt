package com.betrybe.aula4

import java.util.Date
import kotlin.math.absoluteValue

class Person(override val name: String): Human() {
    private val timestamp: Long = Date().time

    override val birthStamp: Long
        get() = this.timestamp

    override var height: Double = 0.3 + (Math.random() * 0.3)
        get() {
            println("$name's height is $field meters")
            return field
        }
        set(value) {
            val difference = value - height
            if (difference > 0) {
                println("$name grew $difference meters")
            } else {
                println("$name shrank ${difference.absoluteValue} meters")
            }

            field = value
        }

    override var weight: Double = 2.0 + (Math.random() * 2)
        set(value) {
            println(value)
            field = value
        }

    override var ageYear: Int = 0
        set(value) {
            println(value)
        }
    
}

fun main() {
    val person = Person("Suzumiya")
    person.height
    person.height = 1.5
}