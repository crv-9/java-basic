package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car;

import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.Vehicle;

public abstract class Car extends Vehicle {

    String modelName;

    public Car(int maxSpeed, int maxPersonCapacity, String modelName) {
        super(maxSpeed, maxPersonCapacity);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
}
