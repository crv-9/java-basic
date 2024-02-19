package io.everyonecodes.java.t3_testing.classExercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExaggeratorTest {
    Exaggerator exaggerator = new Exaggerator();

    @Test
    void exaggerate() {
        String text = "ice-cream";

        String result = exaggerator.exaggerate(text);

        String expected = "ice-cream!";
        Assertions.assertEquals(expected, result);
    }

}
