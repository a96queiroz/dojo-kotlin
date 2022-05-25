package com.example.demo.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(
    name = "marvelApi", url = "https://gateway.marvel.com/v1/public"
)
interface MarvelApiClient {

    @GetMapping("/characters")
    fun findAll(@RequestParam ts: String, @RequestParam apikey: String, @RequestParam hash: String): Any
}
