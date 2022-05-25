package com.example.demo.services

import com.example.demo.clients.GeradornvClient
import com.example.demo.domain.AddressPreviewEntity
import com.example.demo.mappers.AddressPreviewMapper
import com.example.demo.repositories.AddressPreviewRepository
import com.example.demo.resources.responses.AddressPreviewResponse
import org.springframework.stereotype.Service
import java.util.*

@Service
class AddressPreviewService(
    val addressPreviewMapper: AddressPreviewMapper,
    val repository: AddressPreviewRepository,
    val geradornvClient: GeradornvClient
) {

    fun getAddressRandom(): AddressPreviewResponse {
        try {
            return geradornvClient.getAddress()
        } catch (e: Exception) {
            println(e.message)
            return AddressPreviewResponse();
        }
    }

    fun saveEntity(id: UUID?, entity: AddressPreviewEntity): AddressPreviewEntity?{
        if(entity.id!! == id){
            return repository.save(entity)
        }
        return null
    }

    fun save(body: AddressPreviewResponse): AddressPreviewEntity {
        val entity: AddressPreviewEntity = addressPreviewMapper.convertToEntity(body)
        return repository.save(entity)
    }

    fun findById(id: UUID): AddressPreviewEntity {
        return repository.findById(id).orElse(null);
    }

    fun listUnread(): List<AddressPreviewEntity> {
        return repository.findByRead(false);
    }
}
