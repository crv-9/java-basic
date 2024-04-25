package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2;

import io.everyonecodes.java.t9_inheritance.exercises.set1.exercise2.data_classes.*;

public class Main {
    public static void main(String[] args) {

        Mansion mansion = new Mansion("mansionID123", "Vienna", 1000, 2024, true, 200.0);
        Skyscraper skyscraper = new Skyscraper("skyscraperID123", "Vienna", 2000, 2024, false, 4);
        OilDrillPlatform oilDrillPlatform = new OilDrillPlatform("oildrillplatformID123", "Vienna", 3000, 2024, new Drill("Steel", 2, new ElectricDrill("electric", 100, 100)));



    }
}
