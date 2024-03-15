package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {

    public static Optional<Integer> calculateSum(List<Integer> integerList){
        int sum = 0;

        if (integerList.isEmpty()){
            return Optional.empty();
        } else {
            for (Integer number: integerList) {
                sum += number;
            }
        }
        return Optional.of(sum);
    }


}
