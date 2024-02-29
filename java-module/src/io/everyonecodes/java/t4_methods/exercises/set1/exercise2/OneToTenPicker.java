package io.everyonecodes.java.t4_methods.exercises.set1.exercise2;

import java.util.Random;

public class OneToTenPicker {
    public static int pickRandom(){
        Random random =  new Random();

        return random.nextInt(11);
    }
}
