package com.lunch.support

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchSupportApplication

fun main(args: Array<String>) {
	runApplication<LunchSupportApplication>(*args)
}
