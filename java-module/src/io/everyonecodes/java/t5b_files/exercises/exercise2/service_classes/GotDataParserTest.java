package io.everyonecodes.java.t5b_files.exercises.exercise2.service_classes;

import io.everyonecodes.java.t5b_files.exercises.exercise2.data_classes.Character;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GotDataParserTest {
    GotDataParser gotDataParser = new GotDataParser();

    @Test
    void parseLine(){
        String lineTestParser = "Aemon Targaryen (son of Maekar I);Night's Watch;300;4;35;21;1;1;1;0;1;1;0";

        Optional<Character> result = gotDataParser.parseLine(lineTestParser);
        Character expectedCharacter = new Character("Aemon Targaryen (son of Maekar I)", 4,"male");

        assertTrue(result.isPresent());
        assertEquals(expectedCharacter, result.get());
    }

    @Test
    void parseLineEmptyBook(){
        String lineTestParser = "Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0";

        Optional<Character> result = gotDataParser.parseLine(lineTestParser);
        Character expectedCharacter = new Character("Addam Marbrand", "male");

        assertTrue(result.isPresent());
        assertEquals(expectedCharacter, result.get());

    }

    @Test
    void parseLineErrorBookNumber(){
        String lineTestParser = "Addam Marbrand;Lannister;;what;;56;1;1;1;1;1;1;0";

        Optional<Character> result = gotDataParser.parseLine(lineTestParser);

        assertTrue(result.isEmpty());

    }

}
