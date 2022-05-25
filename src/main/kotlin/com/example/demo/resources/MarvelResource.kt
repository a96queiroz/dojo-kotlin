package com.example.demo.resources

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/marvel")
class MarvelResource(private val marvelService: MarvelService) {

    @GetMapping("/characters")
    fun findAll(): Any = marvelService.findAll()
}