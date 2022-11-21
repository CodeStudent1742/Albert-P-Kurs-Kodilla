package com.kodilla.sudoku.ExampleBoard;

import com.kodilla.sudoku.SudokuBoard;

public class Example1 {

    public static void fill(SudokuBoard board) {
        //Row0
        board.setElement(1, 0, 2);
        board.setElement(3, 0, 5);
        board.setElement(5, 0, 1);
        board.setElement(7, 0, 9);
        //Row1
        board.setElement(0, 1, 8);
        board.setElement(3, 1, 2);
        board.setElement(5, 1, 3);
        board.setElement(8, 1, 6);
        //Row2
        board.setElement(1, 2, 3);
        board.setElement(4, 2, 6);
        board.setElement(7, 2, 7);
        //Row3
        board.setElement(2, 3, 1);
        board.setElement(6, 3, 6);
        //Row4
        board.setElement(0, 4, 5);
        board.setElement(1, 4, 4);
        board.setElement(7, 4, 1);
        board.setElement(8, 4, 9);
        //Row5
        board.setElement(2, 5, 2);
        board.setElement(6, 5, 7);
        //Row6
        board.setElement(1, 6, 9);
        board.setElement(4, 6, 3);
        board.setElement(7, 6, 8);
        //Row7
        board.setElement(0, 7, 2);
        board.setElement(3, 7, 8);
        board.setElement(5, 7, 4);
        board.setElement(8, 7, 7);
        //Row8
        board.setElement(1, 8, 1);
        board.setElement(3, 8, 9);
        board.setElement(5, 8, 7);
        board.setElement(7, 8, 6);
    }
}
