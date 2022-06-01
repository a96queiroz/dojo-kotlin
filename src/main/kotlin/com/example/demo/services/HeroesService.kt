package com.example.demo.services

import com.example.demo.domain.HerosRegister
import com.example.demo.resources.responses.AddressPreviewResponse
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class HeroesService(
    private val marvelService: MarvelService, private val addressPreviewService: AddressPreviewService
) {
    val random = Random(0)
    fun findHeroesAndAddress(): HerosRegister {
        val findAll = marvelService.findAll()
        val addressRandom: AddressPreviewResponse = addressPreviewService.getAddressRandom()
        val name = findAll.data.results[random.nextInt(findAll.data.results.size)].name
        return HerosRegister(name, addressRandom)
    }
}