package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1b;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1b.service_classes.NumberSorter.returnGreatestNumber;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>(List.of());

        boolean isStop = false;
        do {
            System.out.println("Enter a number or type stop:");
            String value = userInput.next();
            if (value.equals("stop")){
                isStop = true;
            } else {
                numbers.add(Integer.parseInt(value));
            }
        } while (!isStop);

        returnGreatestNumber(numbers);
        System.out.println(numbers.getLast());
    }
}
