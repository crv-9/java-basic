package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise8.service_classes;

import java.util.List;

public class AboveAverageCounter {
    public static int countAboveAverage(List<Double> numbers){
        int amountNumbers = numbers.size();
        double totalSum = 0.0;
        int counter = 0;

        for (Double number: numbers) {
            totalSum += number;
        }
        for (Double number : numbers) {
            if (number > totalSum/amountNumbers){
                counter++;
            }
        }
        return counter;
    }
}
