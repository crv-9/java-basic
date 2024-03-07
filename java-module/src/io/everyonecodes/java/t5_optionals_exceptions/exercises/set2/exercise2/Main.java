package io.everyonecodes.java.t5_optionals_exceptions.exercises.set2.exercise2;
/*
* Write code that reads in a single String with a Scanner. This String can contain both integer and decimal numbers,
* each of them separated by spaces. Calculate and print the sum of all those numbers.
* Discard anything that is not a number. For example:
"1 2 3.5" -> 6.5
"1 3 10.5 23.6 4" -> 42.1
"1 3 10.5 23.6 hello 10" -> 48.1
*/


public class Main {
    public static double calculate(String input) {
        double sum = 0.0;

        String[] valuesArray = input.split(" ");

        for (String value: valuesArray) {
            try {
                sum += Double.parseDouble(value);
            } catch (NumberFormatException nfe){
                // doing nothing in case of value not being a number
            }
        }
        return sum;
    }
}
