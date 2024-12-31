package com.lunch.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchBatchApplication

fun main(args: Array<String>) {
    runApplication<LunchBatchApplication>(*args)
}
