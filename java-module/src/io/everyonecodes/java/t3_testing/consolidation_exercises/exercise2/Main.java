package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes.Addition.addNumbers;
import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes.ListCreator.createList;
import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise2.service_classes.Multiplier.multiplyNumbers;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of());
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = userInput.nextInt();
        userInput.nextLine();

        numbers = createList(number);
        System.out.println("What should I do with the numbers from 1 to " + number + "? (add or multiply)");
        String operation = userInput.nextLine();


        if (operation.equals("add")){
            System.out.println("Result addition: " + addNumbers(numbers));
        } else {
            System.out.println("Result multiplication: " + multiplyNumbers(numbers));
        }

    }
}
