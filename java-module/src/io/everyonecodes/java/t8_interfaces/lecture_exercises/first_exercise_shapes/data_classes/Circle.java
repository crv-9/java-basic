package io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes.data_classes;

public class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
