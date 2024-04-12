package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentPerformanceReaderTest {
    String inputFilePathString = "src/io/everyonecodes/java/t7_streams/reflection/files/students-performance.csv";
    StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void read () throws IOException {
        Path inputPath = Path.of(inputFilePathString);

        String firstStudentParentalEdu = reader.read(inputPath).getFirst().getParentalEducation();

        assertEquals("bachelor's degree", firstStudentParentalEdu);
    }

}
