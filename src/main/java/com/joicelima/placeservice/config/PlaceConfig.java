package com.joicelima.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.joicelima.placeservice.domain.PlaceRespository;
import com.joicelima.placeservice.domain.PlaceService;

@Configuration
public class PlaceConfig {
    
    @Bean
    PlaceService placeService(PlaceRespository placeRespository){
        return new PlaceService(placeRespository);
    }
}
