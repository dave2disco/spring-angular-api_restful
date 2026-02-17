package com.example.demoapi.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoapi.service.NasaService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class NasaController {
    private final NasaService nasaService;
    public NasaController(NasaService nasaService) {
        this.nasaService = nasaService;
    }
    @GetMapping("/apod/random")
    public Map<String, Object> getRandomAPOD() {
        return nasaService.getRandomAstronomyPicture();
    }
}

