package io.everyonecodes.java.t5b_files.examples.exercise1.service_classes;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.Option;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameReaderTest {
    NameReader nameReader = new NameReader();
    @Test
    void reader(){

        Optional<String> oResult = nameReader.reader();

        assertTrue(oResult.isPresent());
        assertEquals("Jonah", oResult.get());

    }
}
