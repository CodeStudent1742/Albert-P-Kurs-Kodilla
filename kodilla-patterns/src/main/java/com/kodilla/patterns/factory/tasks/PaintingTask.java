package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String TaskName;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        TaskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Executing: PAINTING");
        return true;
    }

    @Override
    public String getTaskName() {
        return "PAINTING";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
