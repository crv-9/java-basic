package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Top5ParentalEducationFinder {

    public static List<String> find(List<StudentPerformance> studentPerformanceList){

        Stream<StudentPerformance> myStream = studentPerformanceList.stream();

        return myStream
                .sorted(Comparator.comparing(StudentPerformance::getMathScore).reversed())
                .limit(5)
                .map(StudentPerformance::getParentalEducation)
                .map(String::valueOf)
                .toList();
    }

}
