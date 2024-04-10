package io.everyonecodes.java.t7b_datastructures.exercises.sets.exercise3.service_classes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberGuesser {

    public static void startGame(){
        Scanner userInput = new Scanner(System.in);
        int numberToGuess = generateRandomNumber();



        Set<Integer> userInputNumbers = new HashSet<>();

        boolean userGuessed = false;

        while (!userGuessed) {
            System.out.println("Please guess a number:");
            int userCurrentInput = userInput.nextInt();

            if (userCurrentInput == numberToGuess) {
                System.out.println(numberToGuess + " is the correct number, congratulations!");
                userGuessed = true;
            } else {
                if (userInputNumbers.contains(userCurrentInput)){
                    System.out.println("You've already tried guessing the number " + userCurrentInput);
                } else {
                    userInputNumbers.add(userCurrentInput);
                    String comparisonString = inputNumberIsSmaller(numberToGuess, userCurrentInput)?"smaller":"bigger";
                    System.out.println("the actual number is " + comparisonString);
                }
            }
        }

    }

    private static int generateRandomNumber(){
        return (int)(Math.random() * ((14) + 1));
    }

    private static boolean inputNumberIsSmaller(int numberToGuess, int inputNumber){
        return inputNumber > numberToGuess;

    }
}
