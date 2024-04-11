package io.everyonecodes.java.t7b_datastructures.lecture_exercises.exerciseSet;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Set items are not be stored in order, that is why we can't call a specific element in an index
        // Sets can't have duplicated items
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Kevin");
        uniqueNames.add("Sarah");
        uniqueNames.add("Ali");
        uniqueNames.add("Carlos");

        for (String name: uniqueNames) {
            System.out.println(name);
        }

        // immutable
        Set<Integer> primeNumbers = Set.of(1,2,3,4,7,11);
        System.out.println(primeNumbers);

        // this set is not be stored randomly. why?
        Set<Integer> modifiedPrimeNumbers = primeNumbers.stream().map(number -> number+1).collect(Collectors.toSet());

        System.out.println(modifiedPrimeNumbers);
    }

    // in which situations does it make more sense to use a List or a Set?
    /* For very large sets, it's significantly faster to check if an element is contained in a set or not.
    * */
}