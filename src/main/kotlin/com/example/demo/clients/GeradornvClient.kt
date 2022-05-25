package com.example.demo.clients

import com.example.demo.resources.responses.AddressPreviewResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "geradornv", url = "https://geradornv.com.br/wp-json/api/cep/random-by-states?state=SP")
interface GeradornvClient {

    @GetMapping
    fun getAddress(): AddressPreviewResponse

}
