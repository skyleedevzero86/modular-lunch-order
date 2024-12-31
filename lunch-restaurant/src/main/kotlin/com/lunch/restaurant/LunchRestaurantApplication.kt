package com.lunch.restaurant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchRestaurantApplication

fun main(args: Array<String>) {
    runApplication<LunchRestaurantApplication>(*args)
}
