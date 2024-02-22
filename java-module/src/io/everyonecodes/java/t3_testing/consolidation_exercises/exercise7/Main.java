package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise7;

import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise7.service_classes.FigurePrinter.printFigure;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("input max amount of stars:");
        int maxStars = userInput.nextInt();

        System.out.println(printFigure(maxStars));
    }
}
