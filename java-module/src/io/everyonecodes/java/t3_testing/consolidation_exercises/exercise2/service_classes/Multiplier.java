package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes;

import java.util.List;

public class Multiplier {
    public static int multiplyNumbers(List<Integer> numbers){
        int result = 0;
        int value = 1;
        for (int number : numbers) {
            result = value * number;
            value = result;
        }
        return result;
    }
}
