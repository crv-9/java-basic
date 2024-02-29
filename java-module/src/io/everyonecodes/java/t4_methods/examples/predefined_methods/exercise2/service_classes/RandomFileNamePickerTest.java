package io.everyonecodes.java.t4_methods.examples.predefined_methods.exercise2.service_classes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomFileNamePickerTest {

    @Test
    void pickRandomFile(){
        List<String> files = List.of("PHOTO_10012020.png", "PHOTO_11012020.png", "PHOTO_12012020.png");

        RandomFileNamePicker randomFileNamePicker = new RandomFileNamePicker();

        String result = randomFileNamePicker.pickRandomFile(files);

        assertTrue(files.contains(result));

    }
}
