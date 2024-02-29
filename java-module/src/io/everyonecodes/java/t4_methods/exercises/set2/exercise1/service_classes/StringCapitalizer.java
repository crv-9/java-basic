package io.everyonecodes.java.t4_methods.exercises.set2.exercise1.service_classes;

public class StringCapitalizer {
    public static String capitalize(String word){
        StringBuilder newWord = new StringBuilder();
        newWord.append(String.valueOf(word.charAt(0)).toUpperCase());
        newWord.append(word.substring(1));

        return String.valueOf(newWord);
    }
}
