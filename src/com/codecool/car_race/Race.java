package com.codecool.car_race;

import com.codecool.car_race.util.VehicleByDistanceTraveledComparator;
import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final int RACE_TIME = 50;

    private boolean yellowFlag = false;

    private List<Vehicle> racers;

    public Race() {
        racers = new ArrayList<>();
    }

    public void registerRacer(Vehicle vehicle) {
        racers.add(vehicle);
    }

    public boolean isYellowFlagActive() {
        return yellowFlag;
    }

    public void setYellowFlag(boolean yellowFlag) {
        this.yellowFlag = yellowFlag;
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */
    public void simulateRace() {
        int yellowFlagCounter = 0;
        for (int i = 0; i < RACE_TIME; i++) {
            Weather.advance();
            yellowFlag = areThereBrokenDownTrucks();
            if (yellowFlag) {
                System.out.println("Yellowflag in lap " + (i + 1));
                yellowFlagCounter++;
            }
            for (Vehicle vehicle : racers) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
        System.out.println("Yellow Flags during the race:" + yellowFlagCounter);
    }

    public boolean areThereBrokenDownTrucks() {
        for (Vehicle vehicle : racers) {
            if (vehicle instanceof Truck && ((Truck) vehicle).isBrokenDown()) return true;
        }
        return false;
    }

    public List<Vehicle> getRacers() {
        return racers;
    }

    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        racers.sort(new VehicleByDistanceTraveledComparator());
        System.out.printf(
                "%26s|%19s|%14s|%13s%n",
                "Name ", " Distance traveled ", " Vehicle type ", " Normal speed");
        for (Vehicle vehicle : racers) {
            System.out.println(vehicle);
        }
    }

}
