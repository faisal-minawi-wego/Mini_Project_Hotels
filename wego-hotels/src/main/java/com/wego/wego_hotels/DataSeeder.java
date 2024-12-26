package com.wego.wego_hotels;

import com.wego.wego_hotels.models.Hotel;
import com.wego.wego_hotels.repositories.HotelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final HotelRepository hotelRepository;

    public DataSeeder(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (hotelRepository.count() == 0) {
            Hotel hotel1 = new Hotel();
            hotel1.setName("Grand Wego Hotel");
            hotel1.setStars(5);

            Hotel hotel2 = new Hotel();
            hotel2.setName("Wego Budget Inn");
            hotel2.setStars(3);

            hotelRepository.save(hotel1);
            hotelRepository.save(hotel2);
        }
    }
}
