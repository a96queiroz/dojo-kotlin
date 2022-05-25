package com.example.demo.services

import com.example.demo.clients.ViaCepClient
import com.example.demo.domain.AddressEntity
import com.example.demo.mappers.AddressMapper
import com.example.demo.repositories.AddressRepository
import com.example.demo.resources.responses.AddressResponse
import org.springframework.stereotype.Service
import java.util.*

@Service
class AddressService(
    private val addressMapper: AddressMapper,
    private val repository: AddressRepository,
    private val viaCepClient: ViaCepClient
) {

    fun getAddress(postalCode: String): AddressResponse {
        try {
            return viaCepClient.getAddress(postalCode)
        } catch (e: Exception) {
            println(e.message)
            return AddressResponse(postalCode)
        }
    }

    fun save(body: AddressResponse): AddressEntity {
        val entity: AddressEntity = addressMapper.convertToEntity(body)
        return repository.save(entity)
    }

    fun update(id: UUID, body: AddressResponse): AddressEntity {
        val entity: AddressEntity = addressMapper.convertToEntity(body)
        entity.id = id
        return repository.save(entity)
    }
}
