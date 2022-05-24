package com.example.demo.services

import com.example.demo.clients.ViaCepClient
import com.example.demo.resources.responses.ViaCepResponse
import org.springframework.stereotype.Service

@Service
class ViaCepService(private val viaCepClient: ViaCepClient) {

    fun getAddress(postalCode: String): ViaCepResponse {
        try {
            return viaCepClient.getAddress(postalCode)
        } catch (e: Exception) {
            println(e.message)
            return ViaCepResponse(postalCode, null, null, null, null, null, null, null, null)
        }
    }
}
