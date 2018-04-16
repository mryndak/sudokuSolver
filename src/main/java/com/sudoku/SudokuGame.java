package com.sudoku;

public class SudokuGame {

    SudokuBoard board;
    SudokuCommander commander;

    public SudokuGame() {
        this.board = SudokuBoard.getSudokuBoardInstance();
        this.commander = new SudokuCommander();
    }

    public SudokuBoard getBoard() {
        return board;
    }

    public SudokuCommander getCommander() {
        return commander;
    }
}
