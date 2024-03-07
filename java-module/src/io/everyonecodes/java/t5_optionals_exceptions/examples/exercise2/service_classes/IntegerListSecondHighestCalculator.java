package io.everyonecodes.java.t5_optionals_exceptions.examples.exercise2.service_classes;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IntegerListSecondHighestCalculator {
    public static Optional<Integer> calculate(List<Integer> inputList){
        Collections.sort(inputList);
        Collections.reverse(inputList);

        if (inputList.isEmpty() || inputList.size() < 2){
            return Optional.empty();
        }

        return Optional.of(inputList.get(1));
    }
}
