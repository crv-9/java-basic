package io.everyonecodes.java.t8_interfaces.exercises.set1.exercises1to3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTriangleSquareShaperTest {
    CircleShaper circleShaper = new CircleShaper();
    TriangleShaper triangleShaper = new TriangleShaper();
    SquareShaper squareShaper = new SquareShaper();

    @Test
    void shapersTests(){
        String resultCircle = circleShaper.getShape();
        String resultTriangle = triangleShaper.getShape();
        String resultSquare = squareShaper.getShape();

        assertEquals("Circle", resultCircle);
        assertEquals("Triangle", resultTriangle);
        assertEquals("Square", resultSquare);
    }

    @Test
    void shapersList(){
        List<Shaper> shaperList = new ArrayList<>();

        shaperList.add(circleShaper);
        shaperList.add(squareShaper);
        shaperList.add(triangleShaper);

        List<String> resultShapeNames = shaperList.stream().map(Shaper::getShape).toList();

        assertEquals(List.of("Circle", "Square", "Triangle"), resultShapeNames);
    }

}
