package io.everyonecodes.java.t9_inheritance.reflection;

import io.everyonecodes.java.t9_inheritance.reflection.vehicles.Limousine;
import io.everyonecodes.java.t9_inheritance.reflection.vehicles.Motorcycle;
import io.everyonecodes.java.t9_inheritance.reflection.vehicles.SportsCar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        myGarage.vehicleFleet.add(new Motorcycle("Harley Davidson", 2, 10, 2, true));
        myGarage.vehicleFleet.add(new Motorcycle("Vespa", 2, 10, 3, false));

        myGarage.vehicleFleet.add(new SportsCar("Aston Martin", 2, 10, 5, 2, true));
        myGarage.vehicleFleet.add(new SportsCar("Ferrari", 1, 10, 3, 1, true));
        myGarage.vehicleFleet.add(new SportsCar("Audi", 2, 15, 5, 2, false));

        myGarage.vehicleFleet.add(new Limousine("Hummer", 10, 30, 15, 5, List.of("Zacapa", "Cihuatan")));
        myGarage.vehicleFleet.add(new Limousine("Hummer", 10, 30, 15, 5, List.of("Grey Goose", "Belvedere")));

        myGarage.refuelAll();
    }
}
