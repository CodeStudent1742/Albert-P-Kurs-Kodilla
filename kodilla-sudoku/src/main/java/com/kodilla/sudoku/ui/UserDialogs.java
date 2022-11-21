package com.kodilla.sudoku.ui;

import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.ai.Solver;

import java.util.Scanner;

public class UserDialogs {

    public static boolean resolveSudoku() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Game ended. Do you want to play again?");
        boolean temp = false;
        boolean decision = false;
        while (!temp) {
            System.out.println("Select (Y)es or (N)o:");
            String s = scanner.nextLine();
            switch (s.toUpperCase()) {
                case "Y":
                    decision = false;
                    temp = true;
                    break;
                case "N":
                    decision = true;
                    temp = true;
                    break;
                default:
                    System.out.println("You inputted wrong key.Try again");
                    temp = false;
                    break;
            }
        }
        return decision;
    }

    public static void fillSudokuToSolve(SudokuBoard sudokuBoard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Sudoku fields for algorithm to solve");
        System.out.println("Use Three digits e.g 123 [column][row][value] ");
        System.out.println("Col and Row from 0 to 8; Values from 0-9 ");
        System.out.println("Input SUDOKU to make algorithm solve the board");
        boolean stopFill = false;
        while (!stopFill) {
            System.out.println("Input 3 digits");
            String s = scanner.nextLine();
            if(s.length() == 3) {
                try {
                    int col = Integer.parseInt(s.substring(0, 1));
                    int row = Integer.parseInt(s.substring(1, 2));
                    int value = Integer.parseInt(s.substring(2, 3));
                    if (col > 8 || row > 8 || value > 9) {
                        throw new Exception();
                    }
                    sudokuBoard.setElement(col, row, value);
                    System.out.println(sudokuBoard);
                } catch (Exception e) {
                    System.out.println("Wrong key, try again. Use 3digits or SUDOKU");
                }
            }else if (s.toUpperCase().equals("SUDOKU")){
                stopFill = true;
            }else{
                System.out.println("Wrong key, try again. Use 3digits or SUDOKU");
            }
        }
    }
}
