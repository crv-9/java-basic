package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1a;

import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1a.service_classes.Printer.returnGreatest;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = userInput.nextInt();
        System.out.println("Enter second number");
        int secondNumber = userInput.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = userInput.nextInt();

        System.out.println("Greatest number is: " + returnGreatest(firstNumber, secondNumber, thirdNumber));

    }
}
