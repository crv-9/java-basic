package io.everyonecodes.java.t4_methods.exercises.set2.exercise1.service_classes;

import java.util.ArrayList;
import java.util.List;

public class MovieTitleFormatter {
    public static String format(String movieName){
        StringCapitalizer stringCapitalizer = new StringCapitalizer();
        String[] stringArrayList = movieName.split(" ",0);
        StringBuilder formattedName = new StringBuilder();

        for (String word: stringArrayList) {
            formattedName.append(stringCapitalizer.capitalize(word));
            formattedName.append(" ");
        }
        formattedName.deleteCharAt(formattedName.length()-1);
        return String.valueOf(formattedName);
    }
}
