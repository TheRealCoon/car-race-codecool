package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;
import com.codecool.car_race.util.Randomizer;

public class Motorcycle extends Vehicle {
    private static final int NORMAL_MOTORCYCLE_SPEED = 100;
    private static final int MIN_RAIN_SPEED_INCLUSIVE = 6;
    private static final int MAX_RAIN_SPEED_EXCLUSIVE = 50;
    private static int motorCycleCounter = 1;

    public Motorcycle() {
        super();
    }

    @Override
    public void prepareForLap(Race race) {
        actualSpeed = (Weather.isRaining()) ? generateRainSpeed() : NORMAL_MOTORCYCLE_SPEED;
    }

    private int generateRainSpeed() {
        return NORMAL_MOTORCYCLE_SPEED - Randomizer.nextInt(MIN_RAIN_SPEED_INCLUSIVE, MAX_RAIN_SPEED_EXCLUSIVE);
    }

    @Override
    protected String generateName() {
        motorCycleCounter++;
        return "Motorcycle " + motorCycleCounter;
    }

    @Override
    protected int generateNormalSpeed() {
        return NORMAL_MOTORCYCLE_SPEED;
    }
}
