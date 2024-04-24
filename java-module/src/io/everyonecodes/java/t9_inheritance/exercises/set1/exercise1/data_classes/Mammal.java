package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Mammal extends Animal {
    String hairColor;

    public Mammal(String species, List<String> movementTypes, String hairColor) {
        super(species, movementTypes);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }
}
