package io.everyonecodes.java.t5b_files.exercises.exercise1;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;
import io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes.HappinessDataReader;
import io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes.HappinessScoreFinder;

import java.io.IOException;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        HappinessDataReader happinessDataReader = new HappinessDataReader();
        HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();

        String countryToFind = "lbv";

        try {
            Optional<Double> doubleResult = happinessScoreFinder.find(happinessDataReader.read(), countryToFind);
            if(doubleResult.isPresent()){
                System.out.println(doubleResult.get());
            } else {
                System.out.println("there was an error with country input // countri not found in the file");
            }
        } catch (IOException e) {
            System.out.println("there was an error reading the file");
        }


//        for (HappinessRecord record : happinessDataReader.read().get()) {
//            System.out.println(record.getCountry() + " " + record.getRank() + " " + record.getScore());
//        }


    }

}
