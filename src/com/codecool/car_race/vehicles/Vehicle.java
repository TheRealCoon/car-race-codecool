package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    //private static final int YELLOW_FLAG_SPEED = 75;
    private String name;
    private final int normalSpeed;
    private int actualSpeed;
    private int distanceTraveled;


    public abstract void prepareForLap() {
        //actualSpeed = (race.isYellowFlagActive()) ? YELLOW_FLAG_SPEED : normalSpeed;
    }

    public abstract void moveForAnHour(){}
}
