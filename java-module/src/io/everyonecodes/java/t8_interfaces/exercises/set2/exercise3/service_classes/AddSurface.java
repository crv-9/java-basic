package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise3.data_classes.BuildingStep;

public class AddSurface implements BuildingStep {
    @Override
    public String apply() {
        return "Surface";
    }
}
