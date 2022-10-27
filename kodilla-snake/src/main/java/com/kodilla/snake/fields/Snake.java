package com.kodilla.snake.fields;

public class Snake implements Field {
    private int snakeX;
    private int snakeY;

    public int getSnakeX() {
        return snakeX;
    }

    public int getSnakeY() {
        return snakeY;
    }

    public void setSnakeX(int snakeX) {
        this.snakeX = snakeX;
    }

    public void setSnakeY(int snakeY) {
        this.snakeY = snakeY;
    }

    @Override
    public String toString() {
        return " o";
    }
}

