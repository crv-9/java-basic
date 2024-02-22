package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise3;

import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise3.service_classes.PyramidMaker.makePyramid;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("input max base");
        int base = userInput.nextInt();

        System.out.println(makePyramid(base));

    }
}
