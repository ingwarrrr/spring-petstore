package com.example.mypetstore.springpetstore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringPetstoreApplication

fun main(args: Array<String>) {
	runApplication<SpringPetstoreApplication>(*args)
}
