package io.everyonecodes.java.consolidations.consolidation1.set2.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;

import java.util.ArrayList;
import java.util.List;

public class SpecialNumbersCounter {
    public static int count(long input){
        // I had to use long as the type because of int length number limitations.
        int counter = 0;
        List<String> stringList = new ArrayList<>(List.of());

        // transforming input into string and string into char array.
        String string = String.valueOf(input);
        char[] chars = string.toCharArray();
        // turning each char into string for comparison - could it be done comparing chars?
        for (char character: chars) {
            stringList.add(String.valueOf(character));
        }


        for (String singleString: stringList) {

            if (singleString.equals("3") || singleString.equals("6") || singleString.equals("9")){
                counter++;
            }
        }

        return counter;
    }

}
