package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public abstract class Animal {
    String species;
    List<String> movementTypes;

    public Animal(String species, List<String> movementTypes) {
        this.species = species;
        this.movementTypes = movementTypes;
    }

    public String getSpecies() {
        return species;
    }

    public List<String> getMovementTypes() {
        return movementTypes;
    }
}
