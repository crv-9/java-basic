package io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.service_classes;

import io.everyonecodes.java.t8_interfaces.exercises.set2.exercise1.data_classes.Operator;

public class Sum implements Operator {

    @Override
    public String getSymbol() {
        return "+";
    }

    @Override
    public double operate(double number1, double number2) {
        return number1 + number2;
    }
}
