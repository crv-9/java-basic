package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise7.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigurePrinterTest {
    static Stream<Arguments> parameters_figurePrinter() {
        return Stream.of(
                Arguments.of(-1, "*\n"),
                Arguments.of(1, "*\n"),
                Arguments.of(3,
                        "*\n" +
                        "**\n" +
                        "***\n" +
                        "**\n" +
                        "*\n")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_figurePrinter")

    void printFigure(int input, String expected){

        FigurePrinter figurePrinter = new FigurePrinter();

        String result = figurePrinter.printFigure(input);

        assertEquals(expected, result);

    }


}
