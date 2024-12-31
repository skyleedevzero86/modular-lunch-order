package com.lunch.web

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchWebApplication

fun main(args: Array<String>) {
    runApplication<LunchWebApplication>(*args)
}
