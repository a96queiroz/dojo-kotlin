package com.example.demo.mappers

import com.example.demo.domain.AddressEntity
import com.example.demo.resources.responses.AddressResponse
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface AddressMapper {

    @Mapping(source = "street", target = "logradouro")
    @Mapping(source = "complement", target = "complemento")
    @Mapping(source = "city", target = "localidade")
    @Mapping(source = "state", target = "uf")
    @Mapping(source = "postalCode", target = "cep")
    fun convertToDto(address: AddressEntity): AddressResponse

    @InheritInverseConfiguration
    @Mapping(target = "id", ignore = true)
    fun convertToEntity(address: AddressResponse): AddressEntity

}
