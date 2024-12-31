package com.lunch.order

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchOrderApplication

fun main(args: Array<String>) {
    runApplication<LunchOrderApplication>(*args)
}
