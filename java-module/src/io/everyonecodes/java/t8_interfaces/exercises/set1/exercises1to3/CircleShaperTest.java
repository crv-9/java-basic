package io.everyonecodes.java.t8_interfaces.exercises.set1.exercises1to3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleShaperTest {


    CircleShaper circleShaper = new CircleShaper();

    @Test
    void getShape(){
        String result = circleShaper.getShape();

        assertEquals("Circle", result);
    }



}
