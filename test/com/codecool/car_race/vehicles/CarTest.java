package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void generateNormalSpeed_run10000Times_NormalSpeedsAreWithinGivenRange() {
        final int TEST_CYCLES = 10000;
        Vehicle testCar = new Car();
        for (int i = 0; i < TEST_CYCLES; i++) {
            testCar.generateNormalSpeed();
            int normalSpeed = testCar.getNormalSpeed();
            assertTrue(normalSpeed > 80 && normalSpeed < 110);
        }
    }

    @Test
    void prepareForLap() {
        final int TEST_CYCLES = 10000;
        final int EXPECTED_SPEED = 75;
        Race testRace = new Race();
        Vehicle testTruck = new Truck();
        Vehicle testCar = new Car();
        for (int i = 0; i < TEST_CYCLES; i++) {
            testRace.setYellowFlag(testRace.areThereBrokenDownTrucks());
            for (Vehicle vehicle: testRace.getRacers()) {
                vehicle.prepareForLap(testRace);
                vehicle.moveForAnHour();
            }
            if (testRace.isYellowFlagActive()) {
                assertEquals(EXPECTED_SPEED, testCar.getActualSpeed());
            }
        }
    }
}