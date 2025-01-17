package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinesCalculator {

    public static List<String> calculateLineSum(List<String> stringList){
        StringToIntegersParser parser =  new StringToIntegersParser();
        IntegerListSumCalculator lineCalculator = new IntegerListSumCalculator();
        List<String> sumsList = new ArrayList<>(List.of());


        for (String currentString: stringList) {
            if (parser.parseLine(currentString).isEmpty()){
                sumsList.add("0");
            } else {
                List<Integer> currentIntList = parser.parseLine(currentString).get();
                int currentSum = 0;
                
                Optional<Integer> result =  lineCalculator.calculateSum(currentIntList);
                sumsList.add(String.valueOf(currentSum));
            }
        }
        return sumsList;

    }

}
