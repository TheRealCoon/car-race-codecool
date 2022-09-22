package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Weather;
import com.codecool.car_race.util.Randomizer;

public class Motorcycle extends Vehicle{
    private static final int NORMAL_SPEED = 100;
    private static final int MIN_RAIN_SPEED = 6;
    private static final int MAX_RAIN_SPEED = 50;

    public Motorcycle() {
        super();
    }

    @Override
    public void prepareForLap(Race race) {
        actualSpeed = (Weather.isRaining()) ? generateRainSpeed() : normalSpeed;
    }

    private int generateRainSpeed() {
        return Randomizer.nextInt(MIN_RAIN_SPEED,MAX_RAIN_SPEED);
    }

    @Override
    protected String generateName() {
        //TODO
        return null;
    }

    @Override
    protected int generateNormalSpeed() {
        return NORMAL_SPEED;
    }
}
