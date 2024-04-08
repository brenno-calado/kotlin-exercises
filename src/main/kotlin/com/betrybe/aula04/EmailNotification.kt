package com.betrybe.aula04

class EmailNotification: Notification {
    override fun sendMessage(msg: String) {
        println("Sending email... $msg")
    }
}