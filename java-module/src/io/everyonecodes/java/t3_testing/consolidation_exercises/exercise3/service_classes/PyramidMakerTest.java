package io.everyonecodes.java.t3_testing.consolidation_exercises.exercise3.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidMakerTest {

    static Stream<Arguments> parameters_makePyramid(){
        return Stream.of(
                Arguments.of(-1, "1\n"),
                Arguments.of(1, "1\n"),
                Arguments.of(2, " 1\n"+"12\n"),
                Arguments.of(3,"  1\n" +" 12\n" + "123\n"),
                Arguments.of(10,
                                "        1\n" +
                                "       12\n" +
                                "      123\n" +
                                "     1234\n" +
                                "    12345\n" +
                                "   123456\n" +
                                "  1234567\n" +
                                " 12345678\n" +
                                "123456789\n")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters_makePyramid")
    void makePyramidTest(int input, String expected){

        PyramidMaker pyramidMaker = new PyramidMaker();

        String result = pyramidMaker.makePyramid(input);

        assertEquals(expected, result);
    }
}
