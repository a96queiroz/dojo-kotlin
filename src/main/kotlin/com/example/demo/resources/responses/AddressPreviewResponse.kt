package com.example.demo.resources.responses

data class AddressPreviewResponse(
    var type: String? = null,
    var street: String? = null,
    var neighborhood: String? = null,
    var city: String? = null,
    var state: String? = null,
    var cep: String? = null
)
