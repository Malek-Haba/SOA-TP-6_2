package com.example.MbarekAmine_LSI3_SOA_TP6;

import com.example.MbarekAmine_LSI3_SOA_TP6.web.jaxrs;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    // Configuration class for setting up Jersey resources
    @Bean
    public ResourceConfig start() {
        // Create a new ResourceConfig instance
        ResourceConfig res = new ResourceConfig();

        // Register the jaxrs class as a resource
        res.register(jaxrs.class);

        // Return the configured ResourceConfig
        return res;
    }
}
