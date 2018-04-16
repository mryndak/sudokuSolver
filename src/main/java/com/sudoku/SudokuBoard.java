package com.sudoku;

import java.util.ArrayList;

public class SudokuBoard {

    private ArrayList<SudokuRow> sudokuRows;
    private ArrayList<SudokuRow> clonedSudokuRows;
    private ArrayList<SudokuElement> clonedSudokuElements;
    private static SudokuBoard sudokuBoardInstance = null;

    private SudokuBoard() {
        sudokuRows = new ArrayList<SudokuRow>() {{
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
            add(new SudokuRow());
        }};
    }

    public static SudokuBoard getSudokuBoardInstance() {
        if (sudokuBoardInstance == null) {
            sudokuBoardInstance = new SudokuBoard();
        }
        return sudokuBoardInstance;
    }

    @Override
    public String toString() {
        StringBuilder boardBuilder = new StringBuilder();
        boardBuilder.append("--------------------------------------")
                .append("\n");
        int rowCount = 0;
        for (SudokuRow r : sudokuRows) {
            rowCount++;
            for (int i = 0; i < r.getSudokuElements().size(); i++) {
                int elementValue = r.getSudokuElements().get(i).getValue();
                if (elementValue == -1) {
                    boardBuilder.append("   ");
                } else {
                    boardBuilder.append(" " + elementValue + " ");
                }
                if (i != 8) {
                    boardBuilder.append("|");
                    if ( i == 2 || i == 5) {
                        boardBuilder.append("|");
                    }
                }
            }
            boardBuilder.append("\n")
                    .append("--------------------------------------");
            if (rowCount == 3 || rowCount == 6) {
                boardBuilder.append("\n")
                        .append("--------------------------------------");
            }
            boardBuilder.append("\n");
        }
        return boardBuilder.toString();
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException {
        SudokuBoard clonedBoard = (SudokuBoard)super.clone();
        clonedBoard.clonedSudokuRows = new ArrayList<>();
        for (SudokuRow row : sudokuRows) {
            ArrayList<SudokuElement> clonedSudokuElements = new ArrayList<>();
            for (SudokuElement element : row.getSudokuElements()) {
                clonedSudokuElements.add(element);
            }
            clonedBoard.getSudokuRows().add(new SudokuRow(clonedSudokuElements));
        }
        return clonedBoard;
    }

    public ArrayList<SudokuRow> getSudokuRows() {
        return sudokuRows;
    }
}
