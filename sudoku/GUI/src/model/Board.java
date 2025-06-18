package model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final List<Cell> cells = new ArrayList<>();
    private int[][] solucaoCompleta;

    public void addCell(Cell cell) {
        cells.add(cell);
    }

    public Cell getCell(int row, int col) {
        return cells.stream()
            .filter(c -> c.getRow() == row && c.getCol() == col)
            .findFirst()
            .orElse(null);
    }

    public boolean isComplete() {
        for (Cell c : cells) {
            if (c.getValue() == 0 || !isValid(c)) return false;
        }
        return true;
    }

    private boolean isValid(Cell cell) {
        int value = cell.getValue();
        int row = cell.getRow();
        int col = cell.getCol();

        for (Cell c : cells) {
            if (c == cell) continue;

            if (c.getValue() == value) {
                if (c.getRow() == row || c.getCol() == col) return false;

                int boxRow = row / 3, boxCol = col / 3;
                int otherBoxRow = c.getRow() / 3, otherBoxCol = c.getCol() / 3;

                if (boxRow == otherBoxRow && boxCol == otherBoxCol) return false;
            }
        }

        return true;
    }

    public void setSolucaoCompleta(int[][] solucao) {
        this.solucaoCompleta = solucao;
    }

    public int[][] getSolucaoCompleta() {
        return solucaoCompleta;
    }
}
