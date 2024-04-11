package io.everyonecodes.java.t7b_datastructures.exercises.maps.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* A service class that allows to count elements in a list;
* a method that takes a list of integers as input and returns a map
* where the key is a number that occurs in the list and the value indicates how often that value appears in the list;
* a method that does the same but instead with a list of strings.
* */

public class ListElementCounter {

    public static Map<Integer, Integer> countNumbers(List<Integer> integerList){
        Map<Integer, Integer> numberAndCount = new HashMap<>();

        for (Integer number: integerList) {
            int amount = (int) integerList.stream().filter(numb -> numb.equals(number)).count();
            numberAndCount.put(number,amount);
        }
        return numberAndCount;
    }
    public static Map<String, Integer> countWords(List<String> stringList){
        Map<String, Integer> wordAndCount = new HashMap<>();

        for (String word: stringList) {
            int amount = (int) stringList.stream().filter(palabra -> palabra.equals(word)).count();
            wordAndCount.put(word,amount);
        }
        return wordAndCount;
    }
}
