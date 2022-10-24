package com.kodilla.testing.snake.fields;

public class Apple implements Field {
    private int appleX;
    private int appleY;

    @Override
    public String toString() {
        return " *";
    }

    public int getAppleX() {
        return appleX;
    }

    public int getAppleY() {
        return appleY;
    }

    public void setAppleX(int appleX) {
        this.appleX = appleX;
    }

    public void setAppleY(int appleY) {
        this.appleY = appleY;
    }
}
