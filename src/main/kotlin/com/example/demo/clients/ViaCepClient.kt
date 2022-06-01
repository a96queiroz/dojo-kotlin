package com.example.demo.clients

import com.example.demo.resources.responses.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws")
interface ViaCepClient {

    @GetMapping("/{postalCode}/json")
    fun getAddress(@PathVariable postalCode: String): AddressResponse

}
