package com.kodilla.testing.snake.ui;

import com.kodilla.testing.snake.Move;
import com.kodilla.testing.snake.fields.Snake;

import java.util.Scanner;

public class UserDialogs {
    public static Move getNextMove(Snake snake){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String getKey = scanner.nextLine();
            try{
                //char getKey = scanner.next().charAt(0);
                if (getKey != 'w'|| getKey != 's' || getKey != 'a' || getKey != 'd'){
                    throw new Exception();
                }
                if (getKey =="w") {
                    return new Move(snake.getSnakeX(),snake.getSnakeY(),snake.getSnakeX(),snake.getSnakeY() -1) ;
                }
                if (getKey =="s") {
                    return new Move(snake.getSnakeX(),snake.getSnakeY(),snake.getSnakeX(),snake.getSnakeY() +1) ;
                }
                if (getKey =="a") {
                    return new Move(snake.getSnakeX(),snake.getSnakeY(),snake.getSnakeX() -1,snake.getSnakeY()) ;
                }
                if (getKey =="d") {
                    return new Move(snake.getSnakeX(),snake.getSnakeY(),snake.getSnakeX() +1 ,snake.getSnakeY()) ;
                }
            }catch(Exception e){
                System.out.println("Wrong key, try again with w s a d");
            }

        }
    }
}
//                if (getKey ='w') {
//                        return new Move(snake.getSnakeX(),snake.getRowSource(),snake.getColSource(),snake.getRowSource()--) ;