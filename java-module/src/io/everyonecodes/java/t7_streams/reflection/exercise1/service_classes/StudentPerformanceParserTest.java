package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentPerformanceParserTest {
    StudentPerformanceParser parser = new StudentPerformanceParser();

    @Test
    void parseLine(){
        String inputLine = "female;bachelor's degree;72;72;74";

        Optional<StudentPerformance> result = parser.parseLine(inputLine);

        StudentPerformance expected = new StudentPerformance("female", "bachelor's degree", 72, 72, 74 );

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());

    }
}
