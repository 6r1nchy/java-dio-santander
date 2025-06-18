package model;

import java.util.*;
import java.util.stream.*;

public class Board {
    private final Cell[][] grid = new Cell[9][9];

    public void addCell(Cell cell) {
        grid[cell.getRow()][cell.getCol()] = cell;
    }

    public Cell getCell(int row, int col) {
        return grid[row][col];
    }

    public void print() {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0) System.out.print("| ");
                int val = grid[row][col].getValue();
                System.out.print(val == 0 ? ". " : val + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }

    public boolean isComplete() {
        return IntStream.range(0, 9).allMatch(this::isValidRow)
            && IntStream.range(0, 9).allMatch(this::isValidCol)
            && IntStream.range(0, 9).allMatch(this::isValidBox);
    }

    private boolean isValidRow(int row) {
        return Arrays.stream(grid[row])
            .map(Cell::getValue)
            .filter(v -> v != 0)
            .collect(Collectors.toSet()).size() == 9;
    }

    private boolean isValidCol(int col) {
        return IntStream.range(0, 9)
            .mapToObj(r -> grid[r][col].getValue())
            .filter(v -> v != 0)
            .collect(Collectors.toSet()).size() == 9;
    }

    private boolean isValidBox(int box) {
        int boxRow = (box / 3) * 3;
        int boxCol = (box % 3) * 3;
        return IntStream.range(0, 9)
            .mapToObj(i -> grid[boxRow + i / 3][boxCol + i % 3].getValue())
            .filter(v -> v != 0)
            .collect(Collectors.toSet()).size() == 9;
    }
}
