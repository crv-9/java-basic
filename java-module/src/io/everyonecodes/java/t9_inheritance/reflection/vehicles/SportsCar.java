package io.everyonecodes.java.t9_inheritance.reflection.vehicles;

public class SportsCar extends Car{
    String vehicleType;
    boolean hasNitro;

    public SportsCar(String brand, int seatNumber, double tankSize, double currentAmountOfFuel, int doorsAmount, boolean hasNitro) {
        super(brand, seatNumber, tankSize, currentAmountOfFuel, doorsAmount);
        this.vehicleType = "Sports car";
        this.hasNitro = hasNitro;
    }

    @Override
    public String refuel(){
        String refuelSummary = "";

        setCurrentAmountOfFuel(getTankSize());

        refuelSummary += vehicleType + " tank refueled.";
        if (hasNitro){
            refuelSummary += " Nitro system also refueled";
        }

        return refuelSummary;
    }
}
