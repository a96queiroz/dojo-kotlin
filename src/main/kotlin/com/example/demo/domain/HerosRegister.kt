package com.example.demo.domain

import com.example.demo.resources.responses.AddressPreviewResponse

data class HerosRegister(
    val name: String, val address: AddressPreviewResponse
)
