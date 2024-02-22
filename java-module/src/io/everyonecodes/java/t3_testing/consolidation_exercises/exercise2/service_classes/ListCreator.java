package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes;

import java.util.ArrayList;
import java.util.List;

public class ListCreator {
    public static List<Integer> createList(int number){
        List<Integer> numbers = new ArrayList<>(List.of());
        for (int i = 0; i < number; i++){
            numbers.add(i, i + 1);
        }
        return numbers;
    }
}
