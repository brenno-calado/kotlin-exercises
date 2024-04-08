package com.betrybe.aula04

class SMSNotification: Notification {
    override fun sendMessage(msg: String) {
        println("Sending SMS... $msg")
    }
}