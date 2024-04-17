package io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_vehicles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FastestVehicleFinder {
    public Vehicle findFastest(List<Car> carList, List<Truck> truckList){
        List<Vehicle> vehicleList = new ArrayList<>(carList);

        vehicleList.addAll(truckList);


        // i'm not sure if this is sorting the vehicles properly.
        return vehicleList.stream()
                .max(Comparator.comparing(Vehicle::getMaxSpeed))
                .get();

    }
}
