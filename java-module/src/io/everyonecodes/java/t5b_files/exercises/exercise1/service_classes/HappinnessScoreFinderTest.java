package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappinnessScoreFinderTest {
    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();

    static Stream<Arguments> parameters_finder(){
        return Stream.of(
                Arguments.of(List.of(new HappinessRecord("Burundi", 154, 2.90499997138977), new HappinessRecord("Sweden", 9, 7.28399991989136)), "Sweden", 7.28399991989136),
                Arguments.of(List.of(new HappinessRecord("Burundi", 154, 2.90499997138977), new HappinessRecord("Sweden", 9, 7.28399991989136)), "Burundi", 2.90499997138977)

        );
    }

    @ParameterizedTest
    @MethodSource("parameters_finder")
    void find(List<HappinessRecord> recordsList, String countryToFind, double expected){

        Optional<Double> result = happinessScoreFinder.find(recordsList, countryToFind);

        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @Test
    void findNoMatch(){
        List<HappinessRecord> recordsList = List.of(new HappinessRecord("Burundi", 154, 2.90499997138977), new HappinessRecord("Sweden", 9, 7.28399991989136));
        String countryToFind = "NoCountry";


        Optional<Double> result = happinessScoreFinder.find(recordsList, countryToFind);

        assertTrue(result.isEmpty());
    }
}
