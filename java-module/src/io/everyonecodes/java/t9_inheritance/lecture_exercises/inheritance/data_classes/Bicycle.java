package io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes;

public class Bicycle extends Vehicle{

    int amountOfSeats;

    public Bicycle(String name, int maxSpeed, int amountOfSeats) {
        super(name, maxSpeed);
        this.amountOfSeats = amountOfSeats;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }
}
