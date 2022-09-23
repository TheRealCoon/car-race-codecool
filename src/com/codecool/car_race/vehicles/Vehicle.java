package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected final String name;
    protected final int normalSpeed;
    protected int actualSpeed;
    protected int distanceTraveled;

    protected Vehicle() {
        this.name = generateName();
        this.normalSpeed = generateNormalSpeed();
        this.distanceTraveled = 0;
    }

    protected abstract String generateName();
    protected abstract int generateNormalSpeed();


    public abstract void prepareForLap(Race race);

    public void moveForAnHour(Race race) {
        prepareForLap(race);
        distanceTraveled += actualSpeed;
    }
}
