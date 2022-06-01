package com.example.demo.domain

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
data class AddressPreviewEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID?,
    var type: String?,
    var street: String?,
    var neighborhood: String?,
    var city: String?,
    var state: String?,
    var cep: String?,
    @Column(columnDefinition="BOOLEAN DEFAULT false")
    var read: Boolean = false
)
