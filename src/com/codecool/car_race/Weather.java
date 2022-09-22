package com.codecool.car_race;

import com.codecool.car_race.util.Randomizer;

import java.util.Random;

public class Weather {
    private static final int CHANCE_OF_RAIN = 30;
    private static boolean isRaining = false;

    public static void advance() {
        isRaining = Randomizer.nextInt(100) < CHANCE_OF_RAIN;
    }

    public static boolean isRaining(){
        return isRaining;
    }
}
