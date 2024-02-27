package io.everyonecodes.java.t4_methods.examples.static_predefined_methods.exercise2;

public class FirstTwoDecimalsExtractor {
    public static double extractTwoDecimals(double decimal){
        // here we take ot the main number, and what is remaining are the decimals
        double floor = Math.floor(decimal);
        double decimals = decimal - floor;
        return Math.floor(decimals * 100);
    }
}
