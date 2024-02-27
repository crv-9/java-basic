package io.everyonecodes.java.t4_methods.exercises.set1.exercise3;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("0", "1", "2", "3", "4", "5", "6");
        System.out.println(pickSecondHalfTEST(list));

        System.out.println("_____");
//        System.out.println(pickFirstHalfTEST(list));
    }

//    int diceRoll = min + random.nextInt((max - min) + 1);


    //It is the same for both even or odd lists.
    public static String pickSecondHalfTEST(List<String> stringList){
        Random random =  new Random();
        if (stringList.size() % 2 == 0){
            int min = (int)(stringList.size()/2.0);
            int max = stringList.size()-1;
            int randomInLimit = min + random.nextInt((max - min) +1);
            return stringList.get(randomInLimit);
        } else {

            int min = (int)(stringList.size()/2.0);
            int max = stringList.size()-1;
            int randomInLimit = min + random.nextInt((max - min)+1);
            return stringList.get(randomInLimit);

        }
    }

    public static String pickFirstHalfTEST(List<String> stringList){
        Random random =  new Random();

        return stringList.get(random.nextInt((int)Math.ceil(stringList.size()/2.0)));
    }
}
