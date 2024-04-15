package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise2.data_classes.Thief;

public class BeginnerThief implements Thief {
    int skillLevel = 1;

    @Override
    public int open() {
        return skillLevel;
    }
}
