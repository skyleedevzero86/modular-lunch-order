package com.lunch.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchCoreApplication

fun main(args: Array<String>) {
    runApplication<LunchCoreApplication>(*args)
}
