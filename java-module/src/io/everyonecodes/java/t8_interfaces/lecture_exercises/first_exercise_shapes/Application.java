package io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes;

import io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes.data_classes.Circle;
import io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes.data_classes.Rectangle;
import io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes.data_classes.Shape;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        Circle circle = new Circle(3);

        List<Shape> shapesList = List.of(rectangle, circle);

        for (Shape shape: shapesList) {
            System.out.println(shape.getArea());
        }

    }
}
