package io.everyonecodes.java.t9_inheritance.exercises.set2.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CustomDrawnPanel extends JPanel {
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Java 2D", 50, 50);
    }

    private static List<Shape> shapesList = new ArrayList<>(List.of());

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
//        g.drawLine(0,100,50,200);
//        shapesList.forEach(s -> s.draw(g));
    }
}
