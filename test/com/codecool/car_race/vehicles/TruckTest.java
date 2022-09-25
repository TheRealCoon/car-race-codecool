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
        //todo why is it around 9% and not 10%? (it works fine in Weather.advance()
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
        assertTrue(chanceOfBrokenDownStateInALap >= 9.9 && chanceOfBrokenDownStateInALap <= 10.1);
    }
}