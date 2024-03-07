package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise4.service_classes;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {
    public static Optional<Double> findMin(List<Double> inputList){

        if (inputList.isEmpty()){
            return Optional.empty();
        }
        Collections.sort(inputList);
        return Optional.of(inputList.getFirst());
    }
}
