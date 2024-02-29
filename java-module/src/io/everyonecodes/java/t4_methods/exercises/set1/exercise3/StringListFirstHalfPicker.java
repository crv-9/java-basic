package io.everyonecodes.java.t4_methods.exercises.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {
    public static String pickFirstHalfTEST(List<String> stringList){
        Random random =  new Random();

        return stringList.get(random.nextInt((int)Math.ceil(stringList.size()/2.0)));
    }

}

