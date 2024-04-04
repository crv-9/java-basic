package io.everyonecodes.java.t7_streams.exercises.set2.exercise5.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class HappinessSpecialFiveFinder {
    public static List<String> findSpecialFive(List<HappinessRecord> happinessRecords){
        Stream<HappinessRecord> myStream = happinessRecords.stream();

        return myStream
                .filter(country-> country.getCountry().contains("a"))
                .filter(country -> country.getCountry().length() > 9)
                .sorted(Comparator.comparing(HappinessRecord::getRank).reversed())
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .map(country -> "Country: " + country.getCountry() + " Rank: " + country.getRank())
                .toList()
                ;
    }
}
