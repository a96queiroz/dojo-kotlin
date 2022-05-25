package com.example.demo.services

import com.example.demo.clients.MarvelApiClient
import org.apache.commons.codec.digest.DigestUtils
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class MarvelService(private val marvelApiClient: MarvelApiClient) {
    private val ts: String = UUID.randomUUID().toString()
    private val publicApiKey: String = ""
    private val privateApiKey: String = ""

    fun findAll(): Any = marvelApiClient.findAll(ts, publicApiKey, hash())

    fun hash(): String = DigestUtils.md5Hex(ts + privateApiKey + publicApiKey);

}