package com.lunch.admin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchAdminApplication

fun main(args: Array<String>) {
    runApplication<LunchAdminApplication>(*args)
}
