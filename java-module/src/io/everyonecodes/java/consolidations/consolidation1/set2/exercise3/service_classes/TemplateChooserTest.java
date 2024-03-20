package io.everyonecodes.java.consolidations.consolidation1.set2.exercise3.service_classes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateChooserTest {
    TemplateChooser chooser = new TemplateChooser();

    @ParameterizedTest
    @CsvSource({
            "Mr. John Smith, male",
            "Mr. John Hokopoko Smith, privileged",
            "Mrs. Jane Smith, female",
            "Jane Smith, default"
    })
    void chooseNormal(String name, String expected){
        String result = chooser.choose(name);

        assertEquals(expected, result);
    }

}
