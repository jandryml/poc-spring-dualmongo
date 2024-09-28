package com.jdr.poc.spring.dualmongo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DualmongoApplication

fun main(args: Array<String>) {
	runApplication<DualmongoApplication>(*args)
}
