package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING= "SHOPPING";

    public final Task takeTask(final String taskClass){
        return switch(taskClass){
            case DRIVING -> new DrivingTask("DRIVING","Krakow","Car");
            case PAINTING -> new PaintingTask("PAINTING","Green","Wall");
            case SHOPPING -> new ShoppingTask("SHOPPING","Milk",2);
            default -> null;
        };
    }


}
