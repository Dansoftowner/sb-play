package com.sb.demo.car

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Service
import java.util.*

@Service
class CarService {
    fun getCar(color: String?) =
        "${color?.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }} car!"
}