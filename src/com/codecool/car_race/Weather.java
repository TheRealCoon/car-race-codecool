package com.codecool.car_race;

import java.util.Random;

public class Weather {
    private static final int CHANCE_OF_RAIN = 30;
    private static boolean isRaining = false;

    public static void advance() {
        Random random = new Random();
        isRaining = random.nextInt(0, 100) < 30;
    }

    public static boolean isRaining(){
        return isRaining;
    }
}
