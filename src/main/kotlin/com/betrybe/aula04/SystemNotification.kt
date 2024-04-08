package com.betrybe.aula04

// ways to delegate

class SystemNotification(private val notificationType: Notification): Notification by notificationType

//class SystemNotification(private val notificationType: Notification): Notification {
//    override fun sendMessage(msg: String) {
//        notificationType.sendMessage(msg)
//    }
//}

//
//class SystemNotification2: Notification {
//    private var notification: Notification? = null
//
//    fun setNotification(n: Notification) {
//        this.notification = n
//    }
//
//    override fun sendMessage(msg: String) {
//        notification?.sendMessage(msg)
//    }
//}
//
//fun main() {
//    val message = "error"
//    val notificationSystem2 = SystemNotification2()
//    notificationSystem2.setNotification(EmailNotification())
//    notificationSystem2.sendMessage(message)

//    val notificationSystem2 = SystemNotification2()
//    notificationSystem2.setNotification(SMSNotification())
//    notificationSystem2.sendMessage(message)
//}
