package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector  {
    private List<Shape> Shapes = new ArrayList<>();

    void addFigure(Shape shape){
        Shapes.add(shape);
    }
    boolean removeFigure(Shape shape){
        boolean result = false;
        if (Shapes.contains(shape)) {
            Shapes.remove(shape);
            result = true;
        }
        return result;
    }
    Shape getFigure(int n){
        return Shapes.get(n);
    }
    String showFigures(){
        String sentence="";
        for(Shape theShape:Shapes){
            sentence = sentence + theShape.getShapeName()+" ";
        }
        return sentence;
    }

    public int size() {
        return Shapes.size();
    }
}
