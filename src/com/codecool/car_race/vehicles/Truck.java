package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.util.Randomizer;

public class Truck extends Vehicle {
    private static final int NORMAL_SPEED = 100;
    private static final int BROKEN_DOWN_SPEED = 0;
    private static final int CHANCE_OF_BREAKDOWN = 5;
    private static final int TIME_NEEDED_TO_FIX_TRUCK = 2;
    private boolean isBrokenDown;
    private int timer;

    public Truck() {
        super();
        isBrokenDown = false;
        timer = TIME_NEEDED_TO_FIX_TRUCK;
    }

    private void generateBrokenDownState() {
        if (!isBrokenDown) {
            isBrokenDown = (Randomizer.nextInt(100) < CHANCE_OF_BREAKDOWN);
            if(isBrokenDown) timer = TIME_NEEDED_TO_FIX_TRUCK;
        } else {
            timer--;
            if (timer == 0) isBrokenDown = false;
        }
    }

    @Override
    public void prepareForLap(Race race) {
        generateBrokenDownState();
        actualSpeed = (isBrokenDown) ? BROKEN_DOWN_SPEED : normalSpeed;
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