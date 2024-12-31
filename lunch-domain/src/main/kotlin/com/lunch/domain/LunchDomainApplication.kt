package com.lunch.domain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LunchDomainApplication

fun main(args: Array<String>) {
	runApplication<LunchDomainApplication>(*args)
}
