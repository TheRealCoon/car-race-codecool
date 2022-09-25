package com.codecool.car_race;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    @Test
    void advance_thereIsAbout30PercentChanceForRain() {
        final double TEST_CYCLES = 10000;
        int counter = 0;
        for (int i = 0; i < TEST_CYCLES; i++) {
            Weather.advance();
            if (Weather.isRaining()) counter++;
        }
        double chanceForRain = counter / TEST_CYCLES * 100;
        System.out.println(chanceForRain);
        assertTrue(chanceForRain >= 29 && chanceForRain <= 31);
    }

}