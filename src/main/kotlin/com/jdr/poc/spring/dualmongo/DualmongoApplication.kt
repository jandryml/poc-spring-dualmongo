package com.jdr.poc.spring.dualmongo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [MongoAutoConfiguration::class])
class DualmongoApplication

fun main(args: Array<String>) {
	runApplication<DualmongoApplication>(*args)
}
