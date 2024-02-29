package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise1.service_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTripleExtractor {
    public static List<Integer> randomExtractor(List<Integer> listInput){
        List<Integer> newList = new ArrayList<>(List.of());

        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            newList.add(listInput.get(random.nextInt(listInput.size()-1)));
        }
        return newList;
    }
}
