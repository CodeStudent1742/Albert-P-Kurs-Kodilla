package com.kodilla.sudoku;

import com.kodilla.sudoku.ExampleBoard.Example1;
import com.kodilla.sudoku.ai.Solver;

public class SudokuMain {

    public static void main(String[] args) {

        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }

    }
}
