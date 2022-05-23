package com.example.demo.resources

import com.example.demo.resources.responses.ViaCepResponse
import com.example.demo.services.ViaCepService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/address")
class ViaCepResource(private val viaCepService: ViaCepService) {

    @GetMapping("/via-cep/{postalCode}")
    fun getAddress(@PathVariable postalCode: String): ViaCepResponse = viaCepService.getAddress(postalCode)

}
