package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise1.service_classes;

import java.util.Collections;
import java.util.List;

public class IntegerListDescendingSorter {
    public static List<Integer> sorterListDescending(List<Integer> intList){

        Collections.sort(intList);
        return intList.reversed();

    }
}
