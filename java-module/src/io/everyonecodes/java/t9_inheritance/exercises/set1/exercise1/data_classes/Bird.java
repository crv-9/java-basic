package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Bird extends Animal {

    String featherColor;

    public Bird(String species, List<String> movementTypes, String featherColor) {
        super(species, movementTypes);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
