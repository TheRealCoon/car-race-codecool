package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;

public class Main {
    private static final int NUMBER_OF_EACH_VEHICLES = 10;
    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 0; i < NUMBER_OF_EACH_VEHICLES; i++) {
            race.registerRacer(new Car());
            race.registerRacer(new Motorcycle());
            race.registerRacer(new Truck());
        }
    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);
        race.simulateRace();
        race.printRaceResults();
    }
}
