package io.everyonecodes.java.t9_inheritance.reflection.vehicles;

public abstract class Vehicle {
    String brand;
    int seatNumber;
    double tankSize;
    double currentAmountOfFuel;


    // constructor
    public Vehicle(String brand, int seatNumber, double tankSize, double currentAmountOfFuel) {
        this.brand = brand;
        this.seatNumber = seatNumber;
        this.tankSize = tankSize;
        this.currentAmountOfFuel = currentAmountOfFuel;
    }


    // refuel method
    public String refuel(){
        return "";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        this.tankSize = tankSize;
    }

    public double getCurrentAmountOfFuel() {
        return currentAmountOfFuel;
    }

    public void setCurrentAmountOfFuel(double currentAmountOfFuel) {
        this.currentAmountOfFuel = currentAmountOfFuel;
    }
}
