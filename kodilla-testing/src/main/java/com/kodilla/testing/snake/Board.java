package com.kodilla.testing.snake;

import com.kodilla.testing.snake.fields.Apple;
import com.kodilla.testing.snake.fields.Field;
import com.kodilla.testing.snake.fields.None;
import com.kodilla.testing.snake.fields.Snake;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board() {
        for(int row=0; row<10;row++){
            rows.add(new BoardRow());
        }
    }
    public Field getField(int col, int row){
        return rows.get(row).getCols().get(col);
    }
    public void setField(int col, int row,Field field){
        rows.get(row).getCols().set(col, field);
    }
    public void move (Move move){

        Field field = getField(move.getColSource(),move.getRowSource());
        setField (move.getColFinal(),move.getRowFinal(), field);
        setField (move.getColSource(),move.getRowSource(), new None());

    }
    public void init(Snake snake, Apple apple){
        Random random = new Random();

        snake.setSnakeX(random.nextInt(10)) ;
        snake.setSnakeY(random.nextInt(10)) ;
        setField(snake.getSnakeY(),snake.getSnakeX(),snake);

        do {
            apple.setAppleX((int)random.nextInt(10));
            apple.setAppleY(random.nextInt(10));
        } while (apple.getAppleX() != snake.getSnakeX() && apple.getAppleY() != snake.getSnakeY());
        setField(apple.getAppleY(),apple.getAppleX(),apple);

    }

        @Override
    public String toString() {
        String s = "|--|--|--|--|--|--|--|--|--|--|\n";
        for(int row = 0;row<10;row++){
            s+= rows.get(row).toString();
        }
        s+="|--|--|--|--|--|--|--|--|--|--|\n";
        return s;
    }
}
