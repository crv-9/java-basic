package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenderRatioCalculatorTest {
    GenderRatioCalculator calculator = new GenderRatioCalculator();
    StudentPerformanceReader reader = new StudentPerformanceReader();


    String inputFilePathString = "src/io/everyonecodes/java/t7_streams/reflection/files/students-performance.csv";
    Path inputPath = Path.of(inputFilePathString);


    static Stream<Arguments> parameters_calculateRatio(){

        StudentPerformance s1 = new StudentPerformance("female","bachelor's degree",72,72,74);
        StudentPerformance s2 = new StudentPerformance("female","some college",72,72,74);
        StudentPerformance s3 = new StudentPerformance("male","bachelor's degree",72,72,74);
        StudentPerformance s4 = new StudentPerformance("male","bachelor's degree",72,72,74);
        StudentPerformance s5 = new StudentPerformance("female","bachelor's degree",72,72,74);


        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(s1, s2, s3, s4, s5))));
    }

    @ParameterizedTest
    @MethodSource("parameters_calculateRatio")
    void calculate(List<StudentPerformance> studentPerformanceList){
        String result = calculator.calculate(studentPerformanceList);

        String expected = "3:2";

        assertEquals(expected, result);
    }


    // extra test reading the actual file
    @Test
    void calculateReal(){
        List<StudentPerformance> studentPerformanceList = reader.read(inputPath);

        String result = calculator.calculate(studentPerformanceList);
        String expected = "518:482";

        assertEquals(expected, result);
    }
}
