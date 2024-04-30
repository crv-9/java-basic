package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car;

public class DieselCar extends Car{
    int fuelCapacity;

    public DieselCar(int maxSpeed, int maxPersonCapacity, String modelName, int fuelCapacity) {
        super(maxSpeed, maxPersonCapacity, modelName);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String getVehicleDescription(){
        return "This is a car, the brand new "+ modelName +". Here are the basic facts:\n" +
                "It reaches speeds up to "+ getMaxSpeed() +"km/h and can carry up to "+ getMaxPersonCapacity() +" people. \n" +
                "Furthermore, it has a fuel capacity of " + fuelCapacity +"l.\n";

    }
}
