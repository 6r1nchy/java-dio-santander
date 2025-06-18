package gui;

import model.Board;

import javax.swing.*;

public class SudokuController {
    private final Board board;
    private final JTextField[][] fields;

    public SudokuController(Board board, JTextField[][] fields) {
        this.board = board;
        this.fields = fields;
    }

    public void atualizarModeloComCampos() {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (!board.getCell(r, c).isFixed()) {
                    String texto = fields[r][c].getText().trim();
                    int val = 0;
                    try {
                        val = Integer.parseInt(texto);
                    } catch (NumberFormatException ignored) {}
                    board.getCell(r, c).setValue(val);
                }
            }
        }
    }

    public void verificarSeCompleto() {
        atualizarModeloComCampos();
        if (board.isComplete()) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você completou o Sudoku!");
        } else {
            JOptionPane.showMessageDialog(null,
                "Ainda há erros ou células em branco.",
                "Verificação",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }

    public void revelarSolucao() {
        int[][] solucao = board.getSolucaoCompleta();
        if (solucao == null) {
            JOptionPane.showMessageDialog(null, "Solução não disponível.");
            return;
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (!board.getCell(r, c).isFixed()) {
                    fields[r][c].setText(String.valueOf(solucao[r][c]));
                    board.getCell(r, c).setValue(solucao[r][c]);
                    fields[r][c].setEditable(false);
                    fields[r][c].setBackground(new java.awt.Color(240, 255, 240)); // verde claro
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Solução revelada. Jogo encerrado.");
    }
}
