package com.codecool.car_race.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomizer {
    private static final Random RANDOM = new Random();

    public static int nextInt(int max){
        return RANDOM.nextInt(max);
    }

    public static String getRandomFromList(List<String> list){
        return list.get(RANDOM.nextInt(list.size()));
    }
}
