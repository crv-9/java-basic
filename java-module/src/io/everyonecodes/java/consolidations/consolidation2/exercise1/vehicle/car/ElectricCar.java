package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(int maxSpeed, int maxPersonCapacity, String modelName, int batteryCapacity) {
        super(maxSpeed, maxPersonCapacity, modelName);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getVehicleDescription(){
        return "This is a car, the brand new "+ modelName +". Here are the basic facts:\n" +
                "It reaches speeds up to "+ getMaxSpeed() +"km/h and can carry up to "+ getMaxPersonCapacity() +" people. \n" +
                "As for the battery, it can store up to " + batteryCapacity +"kWh.\n";
    }
}
