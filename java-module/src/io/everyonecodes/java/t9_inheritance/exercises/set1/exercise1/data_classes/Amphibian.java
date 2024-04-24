package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Amphibian extends Animal{

    boolean hasLegs;

    public Amphibian(String species, List<String> movementTypes, boolean hasLegs) {
        super(species, movementTypes);
        this.hasLegs = hasLegs;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }
}
