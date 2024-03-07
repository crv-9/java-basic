package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise1;
/*
Write code that reads in an integer number in a loop until the user enters "stop",
and then prints the same number incremented by 1.
Make sure the program doesn't crash, but instead displays an error message when the user does not enter a correct number.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop){
            System.out.println("enter a number to add 1 or type stop");
            String value = userInput.nextLine();
            if (value.equals("stop")){
                break;
            }
            try{
                System.out.println(Integer.parseInt(value)+1);
            } catch (Exception e){
                System.out.println("Stopping. You didn't enter a number or proper command.");
                continueLoop = false;
            }
        }
    }
}
