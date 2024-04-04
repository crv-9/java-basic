package io.everyonecodes.java.t7_streams.lecture_exercises;

import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        Optional<String> oName = Optional.of("carlos");

        if (oName.isPresent()){
            System.out.println(oName.get());
            // here I am making it into a stream, but this is not needed. check below.
            System.out.println(oName.stream().map(String::toUpperCase).collect(Collectors.joining()));
        }

        oName.map(String::toUpperCase).ifPresent(System.out::println);
    }
}
