package com.example.demo.resources

import com.example.demo.resources.responses.ComicsResponse
import com.example.demo.services.MarvelService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/marvel")
class MarvelResource(private val marvelService: MarvelService) {

    @GetMapping("/comics")
    fun findAll(): ComicsResponse = marvelService.findAll()
}