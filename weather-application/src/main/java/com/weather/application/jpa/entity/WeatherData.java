package com.weather.application.jpa.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    @JsonProperty("coord")
    private HashMap<String, String> coord;
    @JsonProperty("weather")
    private List<HashMap<String,String>> weather;
    @JsonProperty("main")
    private HashMap<String, String> main;
    @JsonProperty("wind")
    private HashMap<String, String> wind;
    @JsonProperty("sys")
    private HashMap<String, String> sys;
}
