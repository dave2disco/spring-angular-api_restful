package com.example.demoapi.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaService {

    private final RestTemplate restTemplate;

    @Value("${nasa.api.key}")
    private String apiKey;

    public NasaService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getRandomAstronomyPicture() {
        LocalDate startDate = LocalDate.of(1995, 6, 16);
        LocalDate endDate = LocalDate.now();

        long days = ChronoUnit.DAYS.between(startDate, endDate);
        long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
        LocalDate randomDate = startDate.plusDays(randomDays);

        String url = "https://api.nasa.gov/planetary/apod?api_key=" + apiKey + "&date=" + randomDate;
        return restTemplate.getForObject(url, Map.class);
    }
}
