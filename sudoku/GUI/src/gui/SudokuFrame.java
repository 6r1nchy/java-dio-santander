package gui;

import model.Board;
import generator.BoardGenerator;

import javax.swing.*;

public class SudokuFrame extends JFrame {
    public SudokuFrame() {
        setTitle("Sudoku - Java GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);
        setLocationRelativeTo(null);

        Board board = BoardGenerator.generate("medio");
        SudokuPanel panel = new SudokuPanel(board);
        add(panel);

        setResizable(false);
    }
}
