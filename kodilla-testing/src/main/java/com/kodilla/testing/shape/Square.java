package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name = "Square";
    private double dim1;

    public Square(double dim1) {
        this.dim1 = dim1;
    }
    public String getShapeName(){
        return name;
    }
    public double getField(){
            return dim1*dim1;
    }
}
