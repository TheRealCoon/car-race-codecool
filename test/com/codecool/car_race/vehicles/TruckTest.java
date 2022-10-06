package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {

    @Test
    void generateName_run10000Times_ValuesAreBetween0And1000() {
        Vehicle testTruck = new Truck();
        for (int i = 0; i < 10000; i++) {
            int name = Integer.parseInt(testTruck.generateName());
            assertTrue(name > 0 && name < 1000);
        }
    }

    @Test
    void prepareForLap_run100000Times_ActualSpeedEquals0About10PercentChance() {
        final double TEST_CYCLES = 100000;
        Race testRace = new Race();
        Vehicle testTruck = new Truck();
        int brakeDownCounter = 0;
        for (int i = 0; i < TEST_CYCLES; i++) {
            testTruck.prepareForLap(testRace);
            if (testTruck.getActualSpeed() == 0) brakeDownCounter++;
        }
        double chanceOfBrokenDownStateInALap = brakeDownCounter / TEST_CYCLES * 100;
        System.out.println(chanceOfBrokenDownStateInALap);
        assertTrue(chanceOfBrokenDownStateInALap >= 8.6 && chanceOfBrokenDownStateInALap <= 9.4);
    }
}