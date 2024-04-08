package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exerciseMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> healthValues = Map.of(
                "Immune Health", 7,
                "Nutritional Status", 8,
                "Gut Health", 6,
                "Mental Wellness", 5
        );

        System.out.println(healthValues);

        healthValues.forEach((key, value)-> System.out.println("key: " + key + "-- value: " + value));

        Map<String, String> groupSeats = new HashMap<>();

        groupSeats.put("Kevin", "Left");
        groupSeats.put("Sarah", "Center");
        groupSeats.put("Ali", "Right");
        groupSeats.put("Carlos", "Forward");

        System.out.println(groupSeats);
    }
}
