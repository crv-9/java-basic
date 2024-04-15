package io.everyonecodes.java.t8_interfaces.lecture_exercises.first_exercise_shapes.data_classes;

public class Rectangle implements Shape{

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getCircumference() {
        return 0;
    }
}
