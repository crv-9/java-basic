package io.everyonecodes.java.t3_testing.evaluation_exercises.evaluation1_exercise2.service_classes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCheckerTest {

    static Stream<Arguments> parameters_palindromeChecker(){
        return Stream.of(
                Arguments.of("example", "elpmaxe", false),
                Arguments.of("level", "level", true),
                Arguments.of("Radar", "radaR", true)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_palindromeChecker")

    void checkPalindrome(String word, String reversedWord, boolean expected){
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        boolean result = palindromeChecker.checkPalindrome(word, reversedWord);

        assertEquals(expected, result);
    }
}
