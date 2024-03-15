package io.everyonecodes.java.t5b_files.reflection.exercise1.service_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringToIntegersParser {

    public Optional<List<Integer>> parseLine(String line){
        List<Integer> integerList = new ArrayList<>(List.of());


        if (line.isEmpty()){
            return Optional.empty();
        } else {

            List<String> stringList = List.of(line.split(";"));
            for (String numberToBe: stringList) {
                try {
                    integerList.add(getNumber(numberToBe));
                }
                catch (NumberFormatException nfe){
                    // do nothing
                }
            }

        return Optional.of(integerList);
        }
    }

    private int getNumber(String line) throws NumberFormatException{
        return Integer.parseInt(line);
    }


}
