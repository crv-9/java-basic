package io.everyonecodes.java.t9_inheritance.lecture_exercises.inheritance.data_classes;

public class Rocket extends Vehicle{

    String typeOfFuel;

    public Rocket(String name, int maxSpeed, String typeOfPropulsion) {
        super(name, maxSpeed);
        this.typeOfFuel = typeOfPropulsion;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }


}
