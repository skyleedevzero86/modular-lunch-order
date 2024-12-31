package com.lunch.logging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchLoggingApplication

fun main(args: Array<String>) {
    runApplication<LunchLoggingApplication>(*args)
}
