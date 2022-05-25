package com.example.demo.services

import com.example.demo.clients.MarvelApiClient
import com.example.demo.resources.responses.ComicsResponse
import org.springframework.util.DigestUtils
import java.security.MessageDigest
import kotlin.random.Random

class MarvelService(private val marvelApiClient: MarvelApiClient) {
    private val PUBLIC_KEY = "83172a87b511e8660d48a1a01ec8b3c6"
    private val PRIVATE_KEY = "ecd8738d316b7f78ebd390774babff5f46822049"

    fun findAll(): ComicsResponse {
        val ts: Long = Random.nextLong()
        return marvelApiClient.findAll(ts, PUBLIC_KEY, buildHash(ts))
    }

    private fun buildHash(ts: Long): String {
        
    }
}