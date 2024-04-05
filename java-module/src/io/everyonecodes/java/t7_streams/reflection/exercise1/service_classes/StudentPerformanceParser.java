package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;

import java.util.List;
import java.util.Optional;

public class StudentPerformanceParser {
    public Optional<StudentPerformance> parseLine(String inputLine){
        List<String> studentInfo = List.of(inputLine.split(";", 5));

        try {
            String gender = studentInfo.get(0);
            String parentalEducation = studentInfo.get(1);
            int mathScore = Integer.parseInt(studentInfo.get(2));
            int readingScore = Integer.parseInt(studentInfo.get(3));
            int writingScore = Integer.parseInt(studentInfo.get(4));
            return Optional.of(new StudentPerformance(gender, parentalEducation, mathScore, readingScore, writingScore));
        } catch (Exception e){
            return Optional.empty();
        }
    }
}
