package io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle;

import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car.Car;
import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car.DieselCar;
import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.car.ElectricCar;
import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport.Bus;
import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport.Station;
import io.everyonecodes.java.consolidations.consolidation2.exercise1.vehicle.public_transport.Subway;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new DieselCar(220,5,"BMW i4",80));
        vehicleList.add(new ElectricCar(240, 5, "Tesla Model S", 100));

        vehicleList.add(new Bus(List.of(new Station("Skodagasse", 48.21, 16.34), new Station("Westbahnstrasse", 48.2, 16.34)),true));
        vehicleList.add(new Subway(300,List.of(new Station("Suedtiroler Platz", 48.18, 16.37), new Station("Karlsplatz", 48.2, 16.36)),7));


        for (Vehicle vehicle: vehicleList) {
            System.out.println(vehicle.getVehicleDescription());
        }
    }

}
