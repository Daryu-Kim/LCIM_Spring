package com.lcompany.lcim

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LcimApplication

fun main(args: Array<String>) {
	runApplication<LcimApplication>(*args)
}
