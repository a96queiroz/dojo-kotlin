package com.example.demo.resources

import com.example.demo.domain.HerosRegister
import com.example.demo.services.HeroesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/heroes/address")
class MarvelAddressResource(
    private val heroesService: HeroesService
) {
    @GetMapping
    fun findHeroesAddress(): HerosRegister {
        val name = heroesService.findHeroesAndAddress().name
        val address = heroesService.findHeroesAndAddress().address
        return HerosRegister(name, address)
    }
}