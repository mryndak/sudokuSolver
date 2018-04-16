package com.sudoku;

import java.util.ArrayList;

public class SudokuRow {

    private ArrayList<SudokuElement> sudokuElements;

    public SudokuRow() {
        sudokuElements = new ArrayList<SudokuElement>() {{
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
            add(new SudokuElement());
        }};
    }

    public SudokuRow(ArrayList<SudokuElement> sudokuElementsList) {
        sudokuElements = sudokuElementsList;
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
