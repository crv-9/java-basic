package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation2_exercise2.service_classes;

import java.util.ArrayList;
import java.util.List;

public class Capitalizer {
    public static List<String> splitInHalfAndCapitalize(String stringInput){
        List<String> stringsList = new ArrayList<>(List.of());

        stringInput.length();

        if ((stringInput.length() % 2) == 0){
            // even
            stringsList.add(capitalize(stringInput.substring(0, (stringInput.length()/2))));
            stringsList.add(capitalize(stringInput.substring(stringInput.length()/2)));
        } else {
            // odd
            stringsList.add(capitalize(stringInput.substring(0, (stringInput.length()/2)+1)));
            stringsList.add(capitalize(stringInput.substring((stringInput.length()/2)+1)));
        }
        return stringsList;
    }

    public static String capitalize(String inputString){
        return inputString.toUpperCase().charAt(0)+inputString.substring(1);
    }


}
