package io.everyonecodes.java.t8_interfaces.exercises.set1.exercises1to3;

public class RectangleShaper implements Shaper,Colored{


    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

//    Colored colored = (Colored);
//    Shaper shaper = (Shaper);
}
