package com.sb.demo.story

import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class StoryService {
    fun getStories() = listOf(
        Story(title = "Első sztorika", "Daniel", LocalDate.of(1245, 2, 12), "Régi irat"),
        Story(title = "Második sztorika", "Daniel", LocalDate.of(1566, 2, 21), "REFORMÁCIÓ")
    )
}