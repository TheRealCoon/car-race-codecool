package com.codecool.car_race.util;

import com.codecool.car_race.vehicles.Vehicle;

import java.util.Comparator;

public class VehicleByDistanceTraveledComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1 == null || o2 == null) throw new NullPointerException("\n********************************" +
                                                                     "\n One or more vehicles are null! " +
                                                                     "\n ****************************** \n ");
        return Integer.compare(o2.getDistanceTraveled(), o1.getDistanceTraveled());
    }
}
