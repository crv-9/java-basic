package io.everyonecodes.java.t9_inheritance.reflection;

import io.everyonecodes.java.t9_inheritance.reflection.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    List<Vehicle> vehicleFleet = new ArrayList<>();

    public void refuelAll(){
        for (Vehicle vehicle: vehicleFleet) {
            System.out.println(vehicle.refuel());
        }
    }
}
