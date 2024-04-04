package io.everyonecodes.java.t7_streams.exercises.set2.exercise5.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
* A method that receives a list of HappinessRecords and returns a list of Strings
* with the top three countries alongside their happiness scores,
* following the format below.
*/
public class HappinnessTopThreeFinder {
    public static List<String> findTopThree(List<HappinessRecord> happinessRecords){


        Stream<HappinessRecord> myStream = happinessRecords.stream();

        return myStream
                .sorted(Comparator.comparing(HappinessRecord::getScore).reversed())
                .limit(3)
                .map(country -> "Country: " + country.getCountry() + " Score: " + country.getScore())
                .toList()
        ;


    }
}
