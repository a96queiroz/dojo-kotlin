package com.example.demo.clients

import com.example.demo.resources.responses.ComicsResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "marvelApi", url = "http://gateway.marvel.com/v1/public")
interface MarvelApiClient {

    @GetMapping("/comics")
    fun findAll(@RequestParam ts: Long, @RequestParam apiKey: String, @RequestParam hash: String): ComicsResponse
}
