package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public boolean executeTask() {
        System.out.println("Executing: SHOPPING");
        return true;
    }

    @Override
    public String getTaskName() {
        return "SHOPPING";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
