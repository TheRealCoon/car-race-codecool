package com.codecool.car_race.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarNames {
    private static final List<String> names = new ArrayList<>(){{
        add("Silver");
        add("Blizzard");
        add("Blitz");
        add("Quicksilver");
        add("Quest");
        add("Apex");
        add("Alabaster");
        add("Meridian");
        add("Empyrean");
        add("Chase");
        add("Augury");
        add("Elysium");
        add("Voyage");
        add("Empire");
        add("Daydream");
        add("Cosmos");
        add("Resolve");
        add("Buffalo");
        add("Twister");
        add("Barrage");
        add("Renegade");
        add("Shadow");
        add("Excursion");
        add("Mythic");
        add("Motion");
        add("Conqueror");
    }};

    public static String generateName(){
        Random random = new Random();
        return names.get(random.nextInt(0,names.size())) + names.get(random.nextInt(0,names.size()));
    }
}
