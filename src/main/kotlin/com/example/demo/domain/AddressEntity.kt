package com.example.demo.domain

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class AddressEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null,
    var street: String?,
    var complement: String?,
    var city: String?,
    var state: String?,
    var postalCode: String?,
    var district: String?
)
