package io.everyonecodes.java.t4_methods.exercises.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PngCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "PHOTO_10012020, false",
            "10012020.png, true",
            "10012020.PNG, true",
            "10012020.Png, true",
            "10012020.PNg, true",
            "10012020.PNG, true",
            "10012020.pNG, true"
    })
    void checkPNG(String input, boolean expected){
        PngChecker pngChecker = new PngChecker();

        boolean result = pngChecker.checkPNG(input);

        assertEquals(expected, result);
    }
}
