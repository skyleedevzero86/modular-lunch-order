package com.lunch.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchRedisApplication

fun main(args: Array<String>) {
    runApplication<LunchRedisApplication>(*args)
}
