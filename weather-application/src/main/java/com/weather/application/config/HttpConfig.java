package com.weather.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class HttpConfig {
    @Bean
    RestClient getRestClient(){
        return RestClient.create();
    }
}
