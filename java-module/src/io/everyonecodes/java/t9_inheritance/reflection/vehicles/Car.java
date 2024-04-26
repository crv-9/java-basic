package io.everyonecodes.java.t9_inheritance.reflection.vehicles;

public class Car extends Vehicle{
    int doorsAmount;

    // constructor
    public Car(String brand, int seatNumber, double tankSize, double currentAmountOfFuel, int doorsAmount) {
        super(brand, seatNumber, tankSize, currentAmountOfFuel);
        this.doorsAmount = doorsAmount;
    }




    // getters and setters
    public int getDoorsAmount() {
        return doorsAmount;
    }

    public void setDoorsAmount(int doorsAmount) {
        this.doorsAmount = doorsAmount;
    }
}
