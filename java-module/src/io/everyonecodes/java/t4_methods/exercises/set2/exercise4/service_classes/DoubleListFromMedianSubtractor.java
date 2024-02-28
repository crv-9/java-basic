package io.everyonecodes.java.t4_methods.exercises.set2.exercise4.service_classes;

import io.everyonecodes.java.t4_methods.exercises.set2.exercise3.service_classes.DoubleListMedianCalculator;

import java.util.Collections;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public static List<Double> calculate(List<Double> inputList){
        DoubleListMedianCalculator doubleListMedianCalculator = new DoubleListMedianCalculator();
        double median = doubleListMedianCalculator.calculateMedian(inputList);

        inputList.replaceAll(number -> number - median);

        return inputList;
    }
}
