package io.everyonecodes.java.t5b_files.exercises.exercise1.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise1.data_classes.HappinessRecord;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappinnessDataParserTest {
    HappinessDataParser happinessDataParser = new HappinessDataParser();

    @Test
    void parseLineNormal(){
        String lineToParse = "Madagascar;144;3.64400005340576;3.71431910589337;3.57368100091815;0.305808693170547;0.913020372390747;0.375223308801651;0.189196765422821;0.208732530474663;0.067231975495815;1.58461260795593";

        Optional<HappinessRecord> result = happinessDataParser.parseLine(lineToParse);

        assertTrue(result.isPresent());
        assertEquals(new HappinessRecord("Madagascar", 144, 3.64400005340576), result.get());
    }

    @Test
    void parseLineWrong(){
        String lineToParse = "Madagascar;notANumber;3.64400005340576;3.71431910589337;3.57368100091815;0.305808693170547;0.913020372390747;0.375223308801651;0.189196765422821;0.208732530474663;0.067231975495815;1.58461260795593";

        Optional<HappinessRecord> result = happinessDataParser.parseLine(lineToParse);

        assertTrue(result.isEmpty());
    }
}
