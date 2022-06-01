package com.example.demo.repositories

import com.example.demo.domain.AddressPreviewEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AddressPreviewRepository : JpaRepository<AddressPreviewEntity, UUID> {
    fun findByRead(read: Boolean): List<AddressPreviewEntity>;
}
