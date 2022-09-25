package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.CarNames;
import com.codecool.car_race.util.Randomizer;

public class Car extends Vehicle {
    private final int MIN_NORMAL_SPEED_INCLUSIVE = 81;
    private final int MAX_NORMAL_SPEED_EXCLUSIVE = 110;
    private static final int YELLOW_FLAG_SPEED = 75;

    public Car() {
        super();
    }

    @Override
    protected String generateName() {
        return CarNames.generateName();
    }

    @Override
    protected int generateNormalSpeed() {
        return Randomizer.nextInt(MIN_NORMAL_SPEED_INCLUSIVE, MAX_NORMAL_SPEED_EXCLUSIVE);
    }

    @Override
    public void prepareForLap(Race race) {
        setActualSpeed((race.isYellowFlagActive()) ? YELLOW_FLAG_SPEED : getNormalSpeed());
    }

}
