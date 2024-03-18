package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1a.service_classes;

public class Printer {
    public static int returnGreatest(int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
