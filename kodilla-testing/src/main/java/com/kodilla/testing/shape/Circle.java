package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name = "Circle";
    private double dim1;

    public Circle(double dim1) {
        this.dim1 = dim1;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){
            return 3.14 * dim1;
    }
}
