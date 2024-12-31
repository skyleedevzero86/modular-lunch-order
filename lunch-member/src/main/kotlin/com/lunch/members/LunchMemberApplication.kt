package com.lunch.members

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchMemberApplication

fun main(args: Array<String>) {
    runApplication<LunchMemberApplication>(*args)
}
