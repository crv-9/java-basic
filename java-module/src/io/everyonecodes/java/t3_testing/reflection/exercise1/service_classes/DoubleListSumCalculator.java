package io.everyonecodes.java.t3_testing.reflection.exercise1.service_classes;

import java.util.List;

public class DoubleListSumCalculator {
    public static double calculate(List<Double> doubleList){
        double sum = 0.0;

        for (Double number: doubleList) {
            sum += number;
        }

        return sum;
    }
}
