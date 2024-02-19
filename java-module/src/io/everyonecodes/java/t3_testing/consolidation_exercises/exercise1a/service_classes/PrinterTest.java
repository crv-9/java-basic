package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1a.service_classes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.everyonecodes.java.t3_testing.consolidation_exercises.exercise1a.service_classes.Printer.returnGreatest;

public class PrinterTest {
    @Test
    void firstNumberGreater(){
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 1;

        int result = returnGreatest(firstNumber, secondNumber, thirdNumber);

        int expected = firstNumber;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void secondNumberGreater(){
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 1;

        int result = returnGreatest(firstNumber, secondNumber, thirdNumber);

        int expected = secondNumber;

        Assertions.assertEquals(expected, result);
    }

    @Test
    void thirdNumberGreater(){
        int firstNumber = 5;
        int secondNumber = 3;
        int thirdNumber = 10;

        int result = returnGreatest(firstNumber, secondNumber, thirdNumber);

        int expected = thirdNumber;

        Assertions.assertEquals(expected, result);
    }

}
