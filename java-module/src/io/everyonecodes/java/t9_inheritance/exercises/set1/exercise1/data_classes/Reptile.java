package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Reptile extends Animal{

    boolean hasShell;

    public Reptile(String species, List<String> movementTypes, boolean hasShell) {
        super(species, movementTypes);
        this.hasShell = hasShell;
    }

    public boolean isHasShell() {
        return hasShell;
    }
}
