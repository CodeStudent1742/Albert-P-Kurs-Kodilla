package com.kodilla.testing.shape;

import static java.lang.Math.sqrt;

public class Triangle implements Shape {
    private String name = "Triangle";
    private double dim1;
    private double dim2;
    private double dim3;

    public Triangle(double dim1, double dim2, double dim3) {
        this.dim1 = dim1;
        this.dim2 = dim2;
        this.dim3 = dim3;
    }

    public String getShapeName(){
        return name;
    }
    public double getField(){
            double p =(dim1 + dim2 + dim3)/2;
            return sqrt(p*(p-dim1)*(p-dim2)*(p-dim3));
    }
}
