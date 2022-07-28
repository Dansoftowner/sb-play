package com.sb.demo.hello

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/hello")
class HelloController {

    @Autowired
    private lateinit var service: HelloService

    @GetMapping("/{greeting}")
    @ResponseBody
    fun hello(@PathVariable("greeting") greeting: String?, @RequestParam("name") name: String?) = service.hello(greeting, name)

    @RequestMapping(path = ["list"], produces = [ "application/json"])
    @ResponseBody()
    fun list() = service.list()

    @RequestMapping(path = ["heading{level}"], produces = [ "text/html"])
    @ResponseBody
    fun heading(@PathVariable level: String?, @RequestParam text: String?) = "<h$level>$text</h$level>"
}