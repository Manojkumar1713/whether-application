package com.weather.application.service;

import com.weather.application.jpa.entity.WeatherData;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RequiredArgsConstructor
public class WeatherService {

    @Value("${spring.secret.apikey}")
    private String API_KEY;
    private final RestClient restClient;
    @Value("${spring.secret.baseurl}")
    private String BASE_URL;

    public WeatherData getWeatherData(String lat, String aLong) {
        String url = String.format(BASE_URL, lat, aLong, API_KEY);

        return restClient.get()
                .uri(url)
                .retrieve()
                .body(WeatherData.class);
    }
}
