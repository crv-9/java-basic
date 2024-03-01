package io.everyonecodes.java.t4_methods.reflection.exercise1.service_classes;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {
    public static int pick(List<Integer> inputList){
        Random random =  new Random();
        if (!inputList.isEmpty()){
            Collections.sort(inputList);
            // here I am doing a random to return either min or max ; true returns max, false returns min
            if (random.nextBoolean()){
                return inputList.getLast();
            } else {
                return inputList.getFirst();
            }

        } else {
            return random.nextInt();
        }
    }
}
