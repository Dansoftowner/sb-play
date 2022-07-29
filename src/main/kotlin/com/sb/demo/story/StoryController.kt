package com.sb.demo.story

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller("/")
class StoryController {

    @Autowired
    private lateinit var service: StoryService

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("pageTitle", "Az a nagy cím")
        model.addAttribute("stories", getStories())
        return "index"
    }

    private fun getStories() = service.getStories()
}