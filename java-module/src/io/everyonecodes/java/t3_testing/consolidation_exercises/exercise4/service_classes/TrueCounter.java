package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise4.service_classes;

import java.util.List;

public class TrueCounter {
    public static int countTrue(List<Boolean> booleanList){
        int counter = 0;
        for (boolean item : booleanList) {
            if (item){
                counter++;
            }
        }
        return counter;

    }
}
