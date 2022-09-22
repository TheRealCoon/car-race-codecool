package com.codecool.car_race;

import com.codecool.car_race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final int raceTime = 50;
    private boolean yellowFlag = false;
    private List<Vehicle> racers;
    public Race() {
        racers = new ArrayList<>();
    }
    public void registerRacer(Vehicle vehicle){
        racers.add(vehicle);
    }
    public boolean isYellowFlagActive(){
        return yellowFlag;
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        for (int i = 0; i < raceTime; i++) {
            Weather.advance();
            for (Vehicle vehicle: racers) {
                vehicle.moveForAnHour();
            }
        }
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicle vehicle: racers) {
            System.out.println(vehicle);
        }
    }

}
