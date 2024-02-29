package io.everyonecodes.java.t4_methods.exercises.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public static String pickSecondHalf(List<String> stringList){
        Random random =  new Random();
        int min = (int)(stringList.size()/2.0);
        int max = stringList.size()-1;
        int randomInLimit = min + random.nextInt((max - min) +1);
        return stringList.get(randomInLimit);
    }
}
