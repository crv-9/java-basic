package io.everyonecodes.java.t5b_files.exercises.exercise2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        String stringLine = "Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0";

        List<String> characterInfo = List.of(stringLine.split(";", 8));

        for (String line: characterInfo) {
            System.out.println(line);
        }

    }
}
