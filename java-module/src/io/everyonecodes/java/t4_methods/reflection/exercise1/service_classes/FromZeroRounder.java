package io.everyonecodes.java.t4_methods.reflection.exercise1.service_classes;

public class FromZeroRounder {
    public static double round(double inputDouble){
        if (inputDouble < 0) {return Math.floor(inputDouble);}
        else {return Math.ceil(inputDouble);}
    }
}
