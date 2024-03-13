package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {
    public static Optional<HappinessRecord> parseLine(String line){
            // Here I will create an Object every time we parse a line with the proper data input, otherwise, exception.
            try {
                List<String> countryInfo = List.of(line.split(";", 4));
                return Optional.of(new HappinessRecord(countryInfo.get(0), Integer.parseInt(countryInfo.get(1)), Double.parseDouble(countryInfo.get(2))));
            } catch (NumberFormatException nfe){
                // Do nothing, just skip object creation
                return Optional.empty();
            }

    }
}
