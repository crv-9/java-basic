package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;

import java.util.List;
import java.util.Optional;

public class HappinessScoreFinder {
    public static Optional<Double> find(List<HappinessRecord> recordsList, String name){
        for (HappinessRecord record: recordsList) {
            if (record.getCountry().equals(name)){
                return Optional.of(record.getScore());
            }
        }
        return Optional.empty();
    }
}
