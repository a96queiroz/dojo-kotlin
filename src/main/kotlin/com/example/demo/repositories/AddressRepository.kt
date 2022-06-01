package com.example.demo.repositories

import com.example.demo.domain.AddressEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface AddressRepository : JpaRepository<AddressEntity, UUID> {
}
