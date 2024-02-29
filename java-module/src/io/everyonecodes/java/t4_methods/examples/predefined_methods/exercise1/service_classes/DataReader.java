package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise1.service_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise1.service_classes.StringValidator.hasWhiteSpaces;

public class DataReader {
    public static List<String> stringConverter(String input){
        List<String> stringList = new ArrayList<>();
        if (hasWhiteSpaces(input)){
            stringList.addAll(Arrays.asList(input.toUpperCase().trim().split(",", 0)));

//             This is my approach and works the same as the above line, suggested by IntelliJ
//            for (String string: input.trim().split(",",0)) {
//                stringList.add(string);
//            }

        } else {
            for (String string: input.split(",",0)) {
                stringList.add(string.toUpperCase());
            }
//            Bellow line was suggested by IntelliJ and does the same as the above
//            stringList.addAll(Arrays.asList(input.split(",", 0)));
        }

        return stringList;
    }
}
