package io.everyonecodes.java.t4_methods.exercises.set2.exercise5.service_classes;

import io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise2.FirstTwoDecimalsExtractor;

public class TipAdder {
    public static double add(double input){
        FirstTwoDecimalsExtractor firstTwoDecimalsExtractor = new FirstTwoDecimalsExtractor();

        double amountPlusTip = input + (input * 0.05);

        if (firstTwoDecimalsExtractor.extractTwoDecimals(amountPlusTip) < 50.0){
            return Math.floor(amountPlusTip) + .50;
        }else {
            return Math.ceil(amountPlusTip);
        }
    }
}
