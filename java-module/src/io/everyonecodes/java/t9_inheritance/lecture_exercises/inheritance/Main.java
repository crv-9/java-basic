package io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance;

import io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes.Bicycle;
import io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes.Rocket;
import io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();


        vehicles.add(new Rocket("R1",500, "JetFuel"));
        vehicles.add(new Bicycle("B1", 30, 2));

        for (Vehicle vehicle:
             vehicles) {
            System.out.println(vehicle.getName() + ": " + vehicle.getMaxSpeed());
        }


    }
}
