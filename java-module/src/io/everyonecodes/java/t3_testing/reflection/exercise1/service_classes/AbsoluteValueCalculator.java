package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

public class AbsoluteValueCalculator {
    public static double calculate(double value){
        if (value == 0){
            return 0;
        } else if (value > 0){
            return value;
        } else {
            return value * -1;
        }
    }
}
