package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2;

import java.util.Scanner;

import static io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes.PalindromeChecker.checkPalindrome;
import static io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes.WordReverser.getReversedWord;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean continueCode = true;
        do {
            System.out.println("Enter some text:");
            String word = userInput.nextLine();
            if (word.equals("stop")){
                continueCode = false;
                break;
            }
            System.out.println("Reversed: " + getReversedWord(word));
            if (checkPalindrome(word, getReversedWord(word))){
                System.out.println("That's a palindrome!");
            }
        } while (continueCode);
    }


}
