package com.javaprogram2.Liskov_Substitution_Principle;

public class ShapeDrawer {
    public void drawShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}