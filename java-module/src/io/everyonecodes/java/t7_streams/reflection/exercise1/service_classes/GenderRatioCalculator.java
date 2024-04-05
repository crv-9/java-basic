package io.everyonecodes.java.t7_streams.reflection.exercise1.service_classes;

import io.everyonecodes.java.t7_streams.reflection.exercise1.data_classes.StudentPerformance;

import java.util.List;
import java.util.stream.Stream;

public class GenderRatioCalculator {
    public String calculate(List<StudentPerformance> studentPerformanceList){

        Stream<StudentPerformance> myStream = studentPerformanceList.stream();
        Stream<StudentPerformance> myStream2 = studentPerformanceList.stream();

        int females = (int) myStream
                .filter(student -> student.getGender().startsWith("f"))
                .count();
        ;
        int males = (int) myStream2
                .filter(student -> student.getGender().startsWith("m"))
                .count();
        ;

        return females + ":" + males;
    }
}
