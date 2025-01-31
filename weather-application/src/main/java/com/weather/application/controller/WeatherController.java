package com.weather.application.controller;

import com.weather.application.jpa.entity.WeatherData;
import com.weather.application.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService service;

    @GetMapping("/getDetails/{lat}/{long}")
    public WeatherData getWeatherDetails(@PathVariable("lat") String lat, @PathVariable("long") String Long){
        return service.getWeatherData(lat, Long);
    }

    @GetMapping("/")
    public String test(){
        return "Welcome Weather application";
    }
}
