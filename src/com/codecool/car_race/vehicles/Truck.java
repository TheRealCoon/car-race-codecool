package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public class Truck extends Vehicle{
    private static final int NORMAL_SPEED = 100;
    @Override
    public void prepareForLap(Race race) {

    }

    @Override
    public void moveForAnHour() {

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
