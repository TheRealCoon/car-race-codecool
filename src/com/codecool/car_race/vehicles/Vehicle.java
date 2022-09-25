package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    private final String name;

    private final int normalSpeed;

    private int actualSpeed;

    private int distanceTraveled;

    protected Vehicle() {
        name = generateName();
        normalSpeed = generateNormalSpeed();
        distanceTraveled = 0;
    }
    protected abstract String generateName();


    public abstract void prepareForLap(Race race);

    public int getNormalSpeed() {
        return normalSpeed;
    }

    protected abstract int generateNormalSpeed();

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }


    public void moveForAnHour() {
        distanceTraveled += actualSpeed;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    @Override
    public String toString() {
        return String.format(
                "%25s%17d km%15s%10d km/h",
                name, distanceTraveled, getClass().getSimpleName(), normalSpeed);
    }
}
