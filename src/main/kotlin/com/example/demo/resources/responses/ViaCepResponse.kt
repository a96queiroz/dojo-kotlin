package com.example.demo.domain

data class ViaCepResponse(
    val logradouro: String,
    val localidade: String,
    val cep: String,
    val bairro: String
)
