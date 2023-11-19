package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val config: YebaliConfig,
) {
    @GetMapping("/hello")
    fun hello(): String {
        return "hello ${config.name}"
    }
}