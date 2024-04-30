package io.everyonecodes.java.t9_inheritance.reflection.vehicles;

public class Motorcycle extends Vehicle{

    String vehicleType;
    boolean hasStoring;

    // constructor
    public Motorcycle(String brand, int seatNumber, double tankSize, double currentAmountOfFuel, boolean hasStoring) {
        super(brand, seatNumber, tankSize, currentAmountOfFuel);
        this.vehicleType = "Motorcycle";
        this.hasStoring = hasStoring;
    }

    // refuel method
    @Override
    public String refuel(){
        String refuelSummary = "";
        double amountRefueled = tankSize - currentAmountOfFuel;
        setCurrentAmountOfFuel(getTankSize());

        refuelSummary += vehicleType + " tank filled with " + amountRefueled + " liters of fuel.";

        return refuelSummary;
    }


    // getters and setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isHasStoring() {
        return hasStoring;
    }

    public void setHasStoring(boolean hasStoring) {
        this.hasStoring = hasStoring;
    }
}
