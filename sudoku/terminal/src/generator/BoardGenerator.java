package generator;

import model.Board;
import model.Cell;

import java.util.*;

public class BoardGenerator {
    private static final Random rand = new Random();

    public static Board generate(String dificuldade) {
        int[][] fullGrid = new int[9][9];
        solve(fullGrid, 0, 0);

        boolean[][] fixed = new boolean[9][9];
        int pistas = switch (dificuldade.toLowerCase()) {
            case "facil" -> 40;
            case "medio" -> 30;
            case "dificil" -> 22;
            default -> 35;
        };

        Set<String> revealed = new HashSet<>();
        while (revealed.size() < pistas) {
            int r = rand.nextInt(9);
            int c = rand.nextInt(9);
            revealed.add(r + "," + c);
            fixed[r][c] = true;
        }

        Board board = new Board();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                int value = revealed.contains(r + "," + c) ? fullGrid[r][c] : 0;
                board.addCell(new Cell(r, c, value, revealed.contains(r + "," + c)));
            }
        }

        return board;
    }

    private static boolean solve(int[][] grid, int row, int col) {
        if (row == 9) return true;
        int nextRow = col == 8 ? row + 1 : row;
        int nextCol = (col + 1) % 9;

        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(nums);

        for (int num : nums) {
            if (isValid(grid, row, col, num)) {
                grid[row][col] = num;
                if (solve(grid, nextRow, nextCol)) return true;
                grid[row][col] = 0;
            }
        }
        return false;
    }

    private static boolean isValid(int[][] grid, int r, int c, int v) {
        for (int i = 0; i < 9; i++) {
            if (grid[r][i] == v || grid[i][c] == v) return false;
        }

        int boxR = (r / 3) * 3;
        int boxC = (c / 3) * 3;
        for (int i = 0; i < 9; i++) {
            int br = boxR + i / 3;
            int bc = boxC + i % 3;
            if (grid[br][bc] == v) return false;
        }

        return true;
    }
}
