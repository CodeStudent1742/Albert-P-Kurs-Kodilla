package com.kodilla.sudoku;

import com.kodilla.sudoku.ExampleBoard.Example1;
import com.kodilla.sudoku.ai.Solver;
import com.kodilla.sudoku.ui.UserDialogs;

import static com.kodilla.sudoku.ui.UserDialogs.fillSudokuToSolve;

public class SudokuGame {

    boolean resolveSudoku(){
        boolean result = UserDialogs.resolveSudoku();
        return result;
    }
   public SudokuGame(){
       SudokuBoard sBoard = new SudokuBoard();
       System.out.println(sBoard);
       fillSudokuToSolve(sBoard);
       Solver solver = new Solver(sBoard);
       boolean isSolvable = solver.solve();
       if(isSolvable){
           System.out.println("Sudoku Solved!");
       }else{
           System.out.println("This Sudoku cannot be solved!");
       }
   }
}
