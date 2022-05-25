package com.example.demo.mappers

import com.example.demo.domain.AddressPreviewEntity
import com.example.demo.resources.responses.AddressPreviewResponse
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper
interface AddressPreviewMapper {

    @Mapping(source = "type", target = "type")
    @Mapping(source = "street", target = "street")
    @Mapping(source = "neighborhood", target = "neighborhood")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "state", target = "state")
    @Mapping(source = "cep", target = "cep")
    fun convertToDto(addressPreview: AddressPreviewEntity): AddressPreviewResponse

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "type", target = "type")
    @Mapping(source = "street", target = "street")
    @Mapping(source = "neighborhood", target = "neighborhood")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "state", target = "state")
    @Mapping(source = "cep", target = "cep")
    fun convertToEntity(addressPreview: AddressPreviewResponse): AddressPreviewEntity

}
