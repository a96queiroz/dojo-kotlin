package com.example.demo.services

import com.example.demo.resources.requests.PostalCodeRequest
import com.example.demo.resources.responses.ViaCepResponse
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class ConsultPostalCodeService(private val viaCepService: ViaCepService) {

    val Log = Logger.getLogger(ConsultPostalCodeService::class.java.name)

    val listPostalCodeRequest: List<PostalCodeRequest> = listOf(
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100009"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000"),
        PostalCodeRequest("49100000")
    );

    fun consultViaCep() {
        for (postalCode in listPostalCodeRequest) {
            val response: ViaCepResponse = viaCepService.getAddress(postalCode.postalCode);
            Log.info(String.format("Response ViaCep: postalCode=%s \n response=%s", postalCode, response));
        }
    }
}
