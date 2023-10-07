package com.jaza.userservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class JazaUserServiceApplication

fun main(args: Array<String>) {
    runApplication<JazaUserServiceApplication>(*args)
}