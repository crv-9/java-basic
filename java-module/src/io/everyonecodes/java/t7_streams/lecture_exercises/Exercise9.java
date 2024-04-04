package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("Sarah", "Joe", "Lisa"));

        System.out.println(strings.stream().reduce((str1, str2)-> str1+"--"+str2).orElse("empty list"));
    }
}
