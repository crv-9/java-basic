package io.everyonecodes.java.consolidations.consolidation1.set2.exercise4.service_classes;

import java.util.ArrayList;
import java.util.List;

public class DigitSumCalculator {
    public static int calculate(long input){
        int digitSum = 0;

        List<String> stringList = new ArrayList<>(List.of());
        List<Integer> integerList = new ArrayList<>(List.of());


        String string = String.valueOf(input);
        char[] chars = string.toCharArray();
        // turning each char into string
        for (char character: chars) {
            stringList.add(String.valueOf(character));
        }
        // turning each string into int to add into list.
        for (String value: stringList) {
            integerList.add(Integer.parseInt(value));
        }
        // adding each number into the list
        for (Integer number: integerList) {
            digitSum += number;
        }

        return digitSum;
    }
}
