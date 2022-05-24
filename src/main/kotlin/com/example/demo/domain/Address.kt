package com.example.demo.domain

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: UUID,
    val street: String,
    val complement: String,
    val city: String,
    val country: String,
    val postalCode: String,
    val district: String
)
