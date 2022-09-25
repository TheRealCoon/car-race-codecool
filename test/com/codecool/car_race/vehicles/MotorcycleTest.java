package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void prepareForLap_run10000Times_actualSpeedIsLowerThanNormalSpeedAbout30PercentOfTheTimes() {
        final double TEST_CYCLES = 10000;
        int counter = 0;
        Vehicle testBike = new Motorcycle();
        Race testRace = new Race();
        for (int i = 0; i < TEST_CYCLES; i++) {
            Weather.advance();
            testBike.prepareForLap(testRace);
            if (Weather.isRaining()) {
                assertTrue(testBike.getActualSpeed() < testBike.getNormalSpeed());
                counter++;
            } else {
                assertTrue(testBike.getActualSpeed() == testBike.getActualSpeed());
            }
        }
        double chanceOfLowerSpeed = counter / TEST_CYCLES * 100;
        assertTrue(chanceOfLowerSpeed > 29 && chanceOfLowerSpeed < 31);
    }

    @Test
    void generateRainSpeed_run10000Times_speedDecreasedBy5to50kmph() {
        final int TEST_CYCLES = 10000;
        Vehicle testBike = new Motorcycle();
        for (int i = 0; i < TEST_CYCLES; i++) {
            int actual = ((Motorcycle) testBike).generateRainSpeed();
            int speedSubtract = testBike.getNormalSpeed() - actual;
            assertTrue(speedSubtract > 5 && speedSubtract < 50);
        }

    }
}