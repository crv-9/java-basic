package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.data_classes.Operator;

import java.util.Optional;

public class Calculator {
    static Operators operators = new Operators();
    static Sum sum = new Sum();
    static Subtraction subtraction = new Subtraction();
    static Multiplication multiplication = new Multiplication();
    static Division division = new Division();


    public static Optional<Double> calculate(String userInput){

        String[] strings = userInput.trim().split("\\s+");

        if (Character.isDigit(Integer.parseInt(strings[0])));


        double number1 = Double.parseDouble(strings[0]);
        double number2 = Double.parseDouble(strings[2]);
        String symbol = strings[1];


        if (operators.get().contains(symbol)){
            double result = 0;
            switch (symbol){
                case "+": result = sum.operate(number1, number2); break;
                case "-": result = subtraction.operate(number1, number2); break;
                case "*": result = multiplication.operate(number1, number2); break;
                case "/": result = division.operate(number1, number2); break;
            }
            return Optional.of(result);
        } else {
            return Optional.empty();
        }

    }
}
