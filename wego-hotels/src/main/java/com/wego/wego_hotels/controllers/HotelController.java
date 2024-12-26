package com.wego.wego_hotels.controllers;

import com.wego.wego_hotels.models.Hotel;
import com.wego.wego_hotels.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    public List<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Application is running!";
    }

}
