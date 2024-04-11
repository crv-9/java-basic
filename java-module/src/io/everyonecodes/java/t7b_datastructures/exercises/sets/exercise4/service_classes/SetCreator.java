package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise4.service_classes;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCreator {
    public static Set<Integer> getDistinctNumbers(List<Integer> listA, List<Integer> listB){
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int number: listA) {
            if (!listB.contains(number)){
                distinctNumbers.add(number);
            }
        }
        for (int number: listB) {
            if (!listA.contains(number)){
                distinctNumbers.add(number);
            }
        }

        return distinctNumbers;
    }
    public static Set<Integer> getCommonNumbers(List<Integer> listA, List<Integer> listB){
        Set<Integer> commonNumbers = new HashSet<>();

        for (int number: listA) {
            if (listB.contains(number)){
                commonNumbers.add(number);
            }
        }

        return commonNumbers;
    }
}
