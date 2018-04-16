package com.sudoku;

import java.util.ArrayList;

public class SudokuBoard {

    private ArrayList<SudokuRow> sudokuRows;

    public SudokuBoard() {
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

    @Override
    public String toString() {
        StringBuilder boardBuilder = new StringBuilder();
        boardBuilder.append("---------------------------")
                .append("\n");
        for (SudokuRow r : sudokuRows) {
            for (int i = 0; i < r.getSudokuElements().size(); i++) {
                boardBuilder.append(r.getSudokuElements().get(i).getValue());
                        if (i != 8) {
                        boardBuilder.append("|");
                        }
            }
            boardBuilder.append("\n")
                    .append("---------------------------")
                    .append("\n");
        }
        return boardBuilder.toString();


    }
}
