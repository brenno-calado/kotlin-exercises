package com.betrybe.aula04

object DBConnection {
    private var instance: User? = null
    private val name = System.getenv("NAME")
    private val email: String by lazy {
        val foundEmail = System.getenv("EMAIL")
        println("found email $foundEmail")
        foundEmail
    }

    // object assures a singleton memory principle when calling DBConnection()
    fun init(): User {
        if (instance === null) {
            instance = User(name, email)
        }

        return instance!!
    }
}
