package io.everyonecodes.java.evaluations.evaluation1.exercise2.service_classes;

public class VowelCounter {
    public static int count(String string){
        int counter = 0;
        String stringLower = string.toLowerCase();

        for (Character character: stringLower.toCharArray()) {
            if (character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u')){
                counter++;
            }
        }
        return counter;
    }
}
