package io.everyonecodes.java.t9_inheritance.exercises.set1.exercise1.data_classes;

import java.util.List;

public class Arthropod extends Animal{

    int amountOfLegs;

    public Arthropod(String species, List<String> movementTypes, int amountOfLegs) {
        super(species, movementTypes);
        this.amountOfLegs = amountOfLegs;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }
}
