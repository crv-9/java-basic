package io.everyonecodes.java.t4_methods.exercises.set2.exercise3.service_classes;

import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public static double calculateMedian(List<Double> inputList){

        Collections.sort(inputList);

        if (inputList.size() % 2 == 0 ){
            return (((inputList.get(inputList.size()/2)-1) + inputList.get(inputList.size()/2))/2.0);
        } else {
            return inputList.get(inputList.size()/2);
        }

    }
}
