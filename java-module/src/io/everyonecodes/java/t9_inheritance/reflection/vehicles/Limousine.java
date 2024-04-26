package io.everyonecodes.java.t9_inheritance.reflection.vehicles;

import java.util.List;

public class Limousine extends Car{
    String vehicleType;
    List<String> miniBarDrinks;

    public Limousine(String brand, int seatNumber, double tankSize, double currentAmountOfFuel, int doorsAmount, List<String> miniBarDrinks) {
        super(brand, seatNumber, tankSize, currentAmountOfFuel, doorsAmount);
        this.vehicleType = "Limousine";
        this.miniBarDrinks = miniBarDrinks;
    }

    @Override
    public String refuel(){
        String refuelSummary = "";

        setCurrentAmountOfFuel(getTankSize());

        refuelSummary += vehicleType + " refueled. Drinks restocked: " + miniBarDrinks;


        return refuelSummary;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public List<String> getMiniBarDrinks() {
        return miniBarDrinks;
    }

    public void setMiniBarDrinks(List<String> miniBarDrinks) {
        this.miniBarDrinks = miniBarDrinks;
    }
}
