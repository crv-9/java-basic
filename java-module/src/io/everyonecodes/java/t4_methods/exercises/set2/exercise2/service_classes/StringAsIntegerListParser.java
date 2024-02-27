package io.everyonecodes.java.t4_methods.exercises.set2.exercise2.service_classes;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {
    public static List<Integer> parse(String inputString){
        List<Integer> newList = new ArrayList<>(List.of());

        String[] stringArray = inputString.split(";",0);

        for (String string: stringArray) {
            newList.add(Integer.parseInt(string));
        }
        return newList;
    }
}
