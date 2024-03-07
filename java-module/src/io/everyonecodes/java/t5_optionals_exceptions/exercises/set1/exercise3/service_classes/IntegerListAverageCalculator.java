package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise3.service_classes;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class IntegerListAverageCalculator {
    public static Optional<Double> calculateAverage(List<Integer> inputList){
        double sum = 0.0;
        if (inputList.isEmpty()){
            return Optional.empty();
        }
        for (Integer number: inputList) {
            sum += number;
        }
        return Optional.of(sum / inputList.size());
    }
}
