package io.everyonecodes.java.t5b_files.exercises.exercise4.service_classes;


import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {
    public static List<String> convert(List<Integer> integerList){
        List<String> stringList = new ArrayList<>(List.of());

        for (Integer intLine: integerList) {
            stringList.add(intLine.toString());
        }

        return stringList;
    }
}
