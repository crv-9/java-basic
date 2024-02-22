package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes;

public class WordReverser {
    public static String getReversedWord(String word){
        char[] charArray = word.toCharArray();
        String reversedWord = "";
        StringBuilder sb = new StringBuilder();

        for (char character:charArray) {
            sb.insert(0, character);
        }
        reversedWord = sb.toString();
        return reversedWord;
    }
}
