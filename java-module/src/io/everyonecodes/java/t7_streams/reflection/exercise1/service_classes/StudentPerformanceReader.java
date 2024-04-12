package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentPerformanceReader {

    private final StudentPerformanceParser parser = new StudentPerformanceParser();

    public List<StudentPerformance> read(Path inputPath){

        try {
            return Files.lines(inputPath)
                    .skip(1)
                    .map(parser::parseLine)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>(List.of());
        }

    }
}
