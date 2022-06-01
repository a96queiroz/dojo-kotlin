package com.example.demo.config

import com.example.demo.domain.AddressPreviewEntity
import com.example.demo.resources.responses.AddressResponse
import com.example.demo.services.AddressPreviewService
import com.example.demo.services.AddressService
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.util.logging.Logger

@Configuration
@EnableScheduling
class ConfigSchedule(
    private val addressService: AddressService,
    private val addressPreviewService: AddressPreviewService
) {

    val Log = Logger.getLogger(ConfigSchedule::class.java.name)

    @Scheduled(fixedDelay = 1000 * 30, initialDelay = 1000)
    private fun consultViaCep() {
        Log.info("Starting consult via cep")
        val listAddressesPreview: List<AddressPreviewEntity> = addressPreviewService.listUnread()
        for(addressPreview in listAddressesPreview){
            val response : AddressResponse = addressService.getAddress(addressPreview.cep.toString())
            addressService.save(response);

            addressPreview.read = true
            addressPreviewService.saveEntity(addressPreview.id, addressPreview)
        }
        Log.info("Ending consult via cep")
    }
//
//    @Scheduled(fixedDelay = 1000 * 30, initialDelay = 1000)
//    private fun captureRandomAddresses() {
//        Log.info("Starting search for random postal codes")
//        for (i in 1 until 10) {
//            val response = addressPreviewService.getAddressRandom()
//            val entity = addressPreviewService.save(response)
//            Log.info(entity.toString())
//        }
//        Log.info("Ending search for random postal codes")
//    }
}
