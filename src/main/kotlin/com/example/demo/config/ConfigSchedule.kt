package com.example.demo.config

import com.example.demo.services.ConsultPostalCodeService
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled

@Configuration
@EnableScheduling
class ConfigSchedule(private val consultPostalCodeService: ConsultPostalCodeService) {

    @Scheduled(fixedDelay = 1000 * 120, initialDelay = 1000)
    private fun consultViaCep(){
        consultPostalCodeService.consultViaCep();
    }
}
