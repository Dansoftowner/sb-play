package com.sb.demo.hello

import org.springframework.stereotype.Service

@Service
class HelloService {

    private val names = mutableSetOf<String?>()

    fun hello(greeting: String?, name: String?): String {
        names.add(name)
        return "$greeting $name!"
    }

    fun list() = "[${names.joinToString(separator = ",") { "\"$it\"" }}]"
}