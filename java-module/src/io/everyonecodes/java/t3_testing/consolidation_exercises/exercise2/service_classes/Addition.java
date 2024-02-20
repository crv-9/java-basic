package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes;

import java.util.List;

public class Addition {
    public static int addNumbers(List<Integer> numbers){
        int result = 0;
        for (int number: numbers) {
            result += number;
        }
        return result;
    }
}
