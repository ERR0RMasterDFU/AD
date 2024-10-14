package com.salesianostriana.dam.ejerciciodto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiConfiguracion {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
