package com.example.demo.config

import com.example.demo.services.ConsultPostalCodeService
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import java.util.logging.Logger

@Configuration
@EnableScheduling
class ConfigSchedule(private val consultPostalCodeService: ConsultPostalCodeService) {

    val Log = Logger.getLogger(ConfigSchedule::class.java.name)

    @Scheduled(fixedDelay = 1000 * 120, initialDelay = 1000)
    private fun consultViaCep() {
        Log.info("Iniciando consultViaCep")
//        consultPostalCodeService.consultViaCep()
        Log.info("Finalizando consultViaCep")
    }
}
