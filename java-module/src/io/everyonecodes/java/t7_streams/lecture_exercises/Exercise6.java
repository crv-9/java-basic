package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.List;
import java.util.stream.Collectors;


public class Exercise6 {
    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,5,7,11,13);

        List<Integer> resultList = intList.stream()
                .map(number -> number + 1)
                .collect(Collectors.toList());

        System.out.println(resultList);
    }
}
