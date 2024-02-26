package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise1.service_classes;

public class StringValidator {
    public static boolean hasWhiteSpaces(String input){
        if (input.equals(input.trim())){
            return false;
        } else return true;
    }
}
