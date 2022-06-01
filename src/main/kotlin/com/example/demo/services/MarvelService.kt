package com.example.demo.services

import com.example.demo.clients.MarvelApiClient
import com.example.demo.resources.responses.CharactersResponse
import org.apache.commons.codec.digest.DigestUtils
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MarvelService(private val marvelApiClient: MarvelApiClient) {
    private val ts: String = UUID.randomUUID().toString()
    private val publicApiKey: String = "83172a87b511e8660d48a1a01ec8b3c6"
    private val privateApiKey: String = "ecd8738d316b7f78ebd390774babff5f46822049"

    fun findAll(): CharactersResponse = marvelApiClient.findAll(ts, publicApiKey, hash())

    fun hash(): String = DigestUtils.md5Hex(ts + privateApiKey + publicApiKey);

}