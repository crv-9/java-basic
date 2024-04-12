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

public class Top5ParentalEducationFinderTest {
    Top5ParentalEducationFinder finder = new Top5ParentalEducationFinder();

    StudentPerformanceReader reader = new StudentPerformanceReader();

    String inputFilePathString = "src/io/everyonecodes/java/t7_streams/reflection/files/students-performance.csv";
    Path inputPath = Path.of(inputFilePathString);

    static Stream<Arguments> parameters_findParents(){

        StudentPerformance s1 = new StudentPerformance("female","master's degree",99,72,74);
        StudentPerformance s2 = new StudentPerformance("female","top college",98,72,74);
        StudentPerformance s3 = new StudentPerformance("male","associate's degree",88,72,74);
        StudentPerformance s4 = new StudentPerformance("male","bachelor's degree",87,72,74);
        StudentPerformance s5 = new StudentPerformance("female","some college",77,72,74);
        StudentPerformance s6 = new StudentPerformance("female","high school",50,72,74);
        StudentPerformance s7 = new StudentPerformance("female","high school",50,72,74);

        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(s7, s3, s2, s4, s5, s6, s1))));
    }

    @ParameterizedTest
    @MethodSource("parameters_findParents")
    void find(List<StudentPerformance> studentPerformanceList){

        List<String> result = finder.find(studentPerformanceList);

        List<String> expected = List.of("master's degree", "top college", "associate's degree", "bachelor's degree", "some college");

        assertEquals(expected, result);
    }


    // extra test reading the actual file
    @Test
    void calculateReal(){
        List<StudentPerformance> studentPerformanceList = reader.read(inputPath);

        List<String> result = finder.find(studentPerformanceList);
        List<String> expected = List.of("associate's degree", "some college", "bachelor's degree", "some college", "some college");

        assertEquals(expected, result);
    }

}
