package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Fish extends Animal{
    String waterType;

    public Fish(String species, List<String> movementTypes, String waterType) {
        super(species, movementTypes);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }
}
