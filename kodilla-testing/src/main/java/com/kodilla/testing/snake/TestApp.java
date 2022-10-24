package com.kodilla.testing.snake;

import com.kodilla.testing.snake.fields.Apple;
import com.kodilla.testing.snake.fields.Snake;
import com.kodilla.testing.snake.ui.UserDialogs;
//import com.kodilla.testing.snake.ui.UserDialogs;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main (String[] args){
        Board board = new Board();
        System.out.println(board);
        Snake snake =new Snake();
        Apple apple = new Apple();
//        board.setField(2,2,snake);
//        System.out.println(board);
//        board.move(new Move(2,2,2,3));
//        System.out.println(board);
          board.init(snake,apple);
          System.out.println(board);
//        List<Field> snakeHisX = new ArrayList<>();
//        List<Field> snakeHisY = new ArrayList<>();

        while(true){
            Move move = UserDialogs.getNextMove(snake);
            System.out.println(board);
        }
    }
}


