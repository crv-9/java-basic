package io.everyonecodes.java.t4_methods.reflection.exercise1.service_classes;

import java.util.List;

public class BeforeDashExtractor {
    public static String extract(String inputString){
        List<String> variable = List.of(inputString.split("-"));
        if (variable.size() == 1){return "";}
        else {return variable.getFirst();}
    }
}
