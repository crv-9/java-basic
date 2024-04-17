package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.service_classes.Calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the operation:");

        String desiredCalculation = userInput.nextLine();



        if (Calculator.calculate(desiredCalculation).isPresent()){
            System.out.println("Solution: " + Calculator.calculate(desiredCalculation).get());
        } else System.out.println("Solution: operation not available");

    }
}
