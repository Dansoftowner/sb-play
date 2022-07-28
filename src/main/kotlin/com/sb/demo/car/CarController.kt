package com.sb.demo.car

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/cars")
class CarController {

    @set:Autowired
    lateinit var service: CarService

    @GetMapping
    fun getCar(@RequestParam(required = false) color: String?) = service.getCar(color)
}