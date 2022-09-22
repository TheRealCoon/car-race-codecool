package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public class Vehicle {
    //private static final int YELLOW_FLAG_SPEED = 75;
    private String name;
    private final int normalSpeed;
    private int actualSpeed;
    private int distanceTraveled;

    public Vehicle(String name, int normalSpeed) {
        this.name = name;
        this.normalSpeed = normalSpeed;
    }


    public void prepareForLap() {
        //actualSpeed = (race.isYellowFlagActive()) ? YELLOW_FLAG_SPEED : normalSpeed;
    }

    public void moveForAnHour() {
    }
}
