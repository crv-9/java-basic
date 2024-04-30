package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle;


/*A Vehicle has a maxSpeed (representing the maximum speed)
and a maxPersonCapacity (representing the maximum number of people that can sit in the vehicle).
By default, its getVehicleDescription method returns a representation of the properties in the following format (the concrete values here are just examples):
Maximum Speed: 130km/h
Maximum person capacity: 4

*/

public abstract class Vehicle {
    int maxSpeed;
    int maxPersonCapacity;
    // constructor
    public Vehicle(int maxSpeed, int maxPersonCapacity) {
        this.maxSpeed = maxSpeed;
        this.maxPersonCapacity = maxPersonCapacity;
    }

    public Vehicle(int maxPersonCapacity) {
        this.maxPersonCapacity = maxPersonCapacity;
    }

    public Vehicle() {
    }

    public String getVehicleDescription(){
        String vehicleDescription = "Maximum Speed: " + maxSpeed + "\n" +
                "Maximum person capacity: " + maxPersonCapacity;
        return vehicleDescription;
    }

    // getters
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxPersonCapacity() {
        return maxPersonCapacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setMaxPersonCapacity(int maxPersonCapacity) {
        this.maxPersonCapacity = maxPersonCapacity;
    }
}
