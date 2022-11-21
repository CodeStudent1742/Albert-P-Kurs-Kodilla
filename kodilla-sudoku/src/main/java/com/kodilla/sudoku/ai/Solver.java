package com.kodilla.sudoku.ai;

import com.kodilla.sudoku.BacktrackDTO;
import com.kodilla.sudoku.SudokuBoard;
import com.kodilla.sudoku.SudokuElement;

import java.util.ArrayList;
import java.util.List;

public class Solver {
    private SudokuBoard sudokuBoard;
    private List<BacktrackDTO> backtrack;

    public Solver(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        backtrack = new ArrayList<>();
    }

    public boolean solve() {
        boolean isSolvable = true;
        for (int row = 0; row < sudokuBoard.getBoardSize(); row++) {
            for (int col = 0; col < sudokuBoard.getBoardSize(); col++) {
                if (sudokuBoard.getElement(col, row).getValue() == -1) {
                    boolean status = checkAndFill(col, row, sudokuBoard);

                    if (status == false) {
                        if (backtrack.size() > 0) {
                             BoardDTO backTo = backtrackOperation();
                            sudokuBoard = backTo.getSudokuBoard();
                            col = backTo.getCol();
                            row = backTo.getRow();
                        } else {
                            isSolvable = false;
                            return isSolvable;
                        }
                    }

                }
            }
        }
        System.out.println(sudokuBoard);
        return isSolvable;
    }


    public boolean checkAndFill(int currentCol, int currentRow, SudokuBoard sBoard) {
        SudokuElement currentE = sBoard.getElement(currentCol, currentRow);
        boolean status = true;
        currentE.possibleValuesToString();
        checkRow(currentE, currentRow, sBoard);

        checkCol(currentE, currentCol, sBoard);

        checkBox(currentE, currentRow, currentCol, sBoard);
        currentE.possibleValuesToString();
        boolean result = onePossibilityFill(currentE, currentRow, currentCol, sBoard);

        if (!result && currentE.getPossibleValues().size() == 0) {
            status = false;
        }
        if (!result && currentE.getPossibleValues().size() != 0) {
            guess(currentE, currentRow, currentCol, sBoard);
        }
//        System.out.println(sudokuBoard);
        return status;
    }

    public void checkRow(SudokuElement currentE, int currentRow, SudokuBoard sBoard) {
        for (int col = 0; col < sBoard.getBoardSize(); col++) {
            int temp = sBoard.getElement(col, currentRow).getValue();
            if (temp != -1) currentE.getPossibleValues().remove(Integer.valueOf(temp));
        }
    }

    public void checkCol(SudokuElement currentE, int currentCol, SudokuBoard sBoard) {
        for (int row = 0; row < sBoard.getBoardSize(); row++) {
            int temp = sBoard.getElement(currentCol, row).getValue();
            if (temp != -1) {
                currentE.getPossibleValues().remove(Integer.valueOf(temp));
            }
        }
    }

    public void checkBox(SudokuElement currentE, int currentRow, int currentCol, SudokuBoard sBoard) {
        int localBoxRow = currentRow - currentRow % 3;
        int localBoxColumn = currentCol - currentCol % 3;

        for (int row = localBoxRow; row < localBoxRow + 3; row++) {
            for (int col = localBoxColumn; col < localBoxColumn + 3; col++) {
                int temp = sBoard.getElement(col, row).getValue();
                if (temp != -1) {
                    currentE.getPossibleValues().remove(Integer.valueOf(temp));
                }
            }
        }
    }

    public boolean onePossibilityFill(SudokuElement currentE, int currentRow, int currentCol, SudokuBoard sBoard) {
        if (currentE.getPossibleValues().size() == 1) {
            sBoard.setElement(currentCol, currentRow, currentE.getPossibleValues().get(0));
            return true;
        } else {
            return false;
        }
    }

    private void guess(SudokuElement currentE, int currentRow, int currentCol, SudokuBoard sBoard) {
        int guess = currentE.getPossibleValues().get(0);
        try {
            backtrack.add(new BacktrackDTO(sBoard.deepCopy(), currentCol, currentRow, guess));
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        sBoard.setElement(currentCol, currentRow, guess);
    }
    private BoardDTO backtrackOperation() {
        BoardDTO result = null;
        boolean backtrackHasPossibility = false;
        while (!backtrackHasPossibility) {

            BacktrackDTO CURRENT_BACKTRACK = backtrack.get(backtrack.size() - 1);
            SudokuElement CURRENT_BACKTRACK_ELEMENT = CURRENT_BACKTRACK.getSudokuBoard().getElement(CURRENT_BACKTRACK.getCol(), CURRENT_BACKTRACK.getRow());
//            System.out.println(CURRENT_BACKTRACK_ELEMENT.possibleValuesToString());

            if (CURRENT_BACKTRACK_ELEMENT.getPossibleValues().size() > 0) {
                CURRENT_BACKTRACK_ELEMENT.getPossibleValues().remove(Integer.valueOf(CURRENT_BACKTRACK_ELEMENT.getPossibleValues().get(0)));

                if(CURRENT_BACKTRACK_ELEMENT.getPossibleValues().size() > 0){
                   CURRENT_BACKTRACK_ELEMENT.setValue(CURRENT_BACKTRACK_ELEMENT.getPossibleValues().get(0));
               }
//                System.out.println(CURRENT_BACKTRACK_ELEMENT.possibleValuesToString());

                if (CURRENT_BACKTRACK_ELEMENT.getPossibleValues().size() > 0) {
                    try {
                        sudokuBoard = backtrack.get(backtrack.size() - 1).getSudokuBoard().deepCopy();
                    } catch (CloneNotSupportedException e) {
                        System.out.println(e);
                    }
                    int col = CURRENT_BACKTRACK.getCol();
                    int row = CURRENT_BACKTRACK.getRow();
                    int newRow = row;
                    int newCol;
                    if (col == 0) {
                        newRow = row - 1;
                        newCol = sudokuBoard.getBoardSize() - 1;
                    } else {
                        newCol = col - 1;
                    }
                    result = new BoardDTO(newCol, newRow, sudokuBoard);
                    backtrackHasPossibility = true;
                } else {
                    backtrackHasPossibility = false;
                }
            } else {
                backtrack.remove(backtrack.size() - 1);
                backtrackHasPossibility = false;
            }
        }
        return result;
    }
}



