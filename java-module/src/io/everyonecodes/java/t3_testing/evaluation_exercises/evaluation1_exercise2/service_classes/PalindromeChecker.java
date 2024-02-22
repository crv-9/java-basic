package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes;

public class PalindromeChecker {
    public static boolean checkPalindrome(String word, String reversedWord){
        String lowerWord = word.toLowerCase();
        String lowerReversedWord = reversedWord.toLowerCase();

        return lowerWord.equals(lowerReversedWord);
    }
}
