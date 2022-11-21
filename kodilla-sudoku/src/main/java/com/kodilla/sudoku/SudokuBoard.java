package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends Prototype<SudokuBoard> {
    private int boardSize = 9;
    private List<SudokuRow> rows = new ArrayList<SudokuRow>();

    public SudokuBoard() {
        for (int i = 0; i < boardSize; i++) {
            rows.add(new SudokuRow(boardSize));
        }
    }

    public int getBoardSize() {
        return boardSize;
    }

    public List<SudokuRow> getRows() {
        return rows;
    }

    public void setElement(int col, int row, int value) {
        rows.get(row).getCols().get(col).setValue(value);
    }

    public SudokuElement getElement(int col, int row) {
        return rows.get(row).getCols().get(col);
    }

    public void setRows(List<SudokuRow> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        String s = "";
        for (int row = 0; row < boardSize; row++) {
            s += rows.get(row);
        }
        return s;
    }

    public SudokuBoard shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = super.clone();
        clonedBoard.rows = new ArrayList<>();
        for (SudokuRow theRows : getRows()) {
            SudokuRow clonedRow = new SudokuRow(getBoardSize());
            for (SudokuElement element : theRows.getCols()) {
                clonedRow.getCols().add(new SudokuElement());
            }
            clonedBoard.rows.add(clonedRow);
        }
        int i = 0;
        for (SudokuRow theRows : getRows()) {
            int j = 0;
            for (SudokuElement element : theRows.getCols()) {
                clonedBoard.setElement(j, i, element.getValue());
                clonedBoard.getElement(j, i).setPossibleValues(new ArrayList<>());
                for (int y = 0; y < element.getPossibleValues().size(); y++) {
                    clonedBoard.getElement(j, i).getPossibleValues().add(element.getPossibleValues().get(y));
                }
                j++;
            }
            i++;
        }

        return clonedBoard;
    }
}
