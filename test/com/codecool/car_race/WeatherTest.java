package com.codecool.car_race;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    @Test
    void advance_thereIsAbout30PercentChanceForRain() {
        int counter = 0;
        for (int i = 0; i < 10000; i++) {
            Weather.advance();
            if (Weather.isRaining()) counter++;
        }
        System.out.println(counter);
        assertTrue(counter >= 2950 && counter <= 3050);
    }

}