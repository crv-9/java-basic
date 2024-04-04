package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise4 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        filterElementsThatStartWith(myList, string -> string.startsWith("hi"));

    }
    public static List<String> filterElementsThatStartWith(List<String> inputList, Predicate<String> lambdaPredicate){
        List<String> result = new ArrayList<>();
        for (String element: inputList) {
            if(lambdaPredicate.test(element)){
                result.add(element);
            }
        }
        return result;
    }

}
