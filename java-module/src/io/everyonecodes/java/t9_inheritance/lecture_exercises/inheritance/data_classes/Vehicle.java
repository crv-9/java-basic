package io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes;

public class Vehicle {
    String name;
    int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
