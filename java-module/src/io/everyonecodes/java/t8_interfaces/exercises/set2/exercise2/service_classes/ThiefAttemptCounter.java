package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.data_classes.Safe;
import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.data_classes.Thief;

public class ThiefAttemptCounter {
    public static int countAttempts(Safe safe, Thief thief){
        int counter = 0;


        while (safe.getDifficultyPoints()>0){
            safe.setDifficultyPoints(safe.getDifficultyPoints() - thief.open());
            counter++;
        }

        return counter;
    }
}
