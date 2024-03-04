package io.everyonecodes.java.t5_optionals_exceptions.exercises.set1.exercise2.service_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StringOverlapFinder {
    public static Optional<String> findOverlap(String firstString, String secondString){
        while(!firstString.isEmpty()) {
            if (secondString.startsWith(firstString)) {
                return Optional.of(firstString);
            }
            // for every iteration that it doesn't start with the same letter, we slice the string and go into it again
            // kudos to Max for thinking of it this way.
            firstString = firstString.substring(1);
        }
        return Optional.empty();
    }
}
