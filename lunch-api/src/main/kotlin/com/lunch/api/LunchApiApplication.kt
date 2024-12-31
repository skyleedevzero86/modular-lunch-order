package com.lunch.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchApiApplication

fun main(args: Array<String>) {
    runApplication<LunchApiApplication>(*args)
}
