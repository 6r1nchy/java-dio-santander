package gui;

import model.Board;
import model.Cell;

import javax.swing.*;
import java.awt.*;

public class SudokuPanel extends JPanel {
    private final JTextField[][] fields = new JTextField[9][9];
    private final Board board;
    private SudokuController controller;

    public SudokuPanel(Board board) {
        this.board = board;
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(9, 9));
        initBoard(gridPanel);
        add(gridPanel, BorderLayout.CENTER);

        controller = new SudokuController(board, fields);

        JPanel botoes = new JPanel(new FlowLayout());
        JButton verificar = new JButton("Verificar");
        verificar.addActionListener(e -> controller.verificarSeCompleto());

        JButton revelar = new JButton("Mostrar Solução");
        revelar.addActionListener(e -> {
            int opcao = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja mostrar a solução?\nIsso encerrará o jogo atual.",
                "Confirmar",
                JOptionPane.YES_NO_OPTION
            );
            if (opcao == JOptionPane.YES_OPTION) {
                controller.revelarSolucao();
            }
        });

        botoes.add(verificar);
        botoes.add(revelar);
        add(botoes, BorderLayout.SOUTH);
    }

    private void initBoard(JPanel gridPanel) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                Cell cell = board.getCell(r, c);
                JTextField field = new JTextField();

                field.setHorizontalAlignment(JTextField.CENTER);
                field.setFont(new Font("SansSerif", Font.BOLD, 18));
                field.setBorder(BorderFactory.createLineBorder(Color.GRAY));

                if (cell.isFixed()) {
                    field.setText(String.valueOf(cell.getValue()));
                    field.setEditable(false);
                    field.setBackground(new Color(220, 220, 220));
                } else {
                    field.setText("");
                    field.setEditable(true);
                    field.setBackground(Color.WHITE);
                }

                fields[r][c] = field;
                gridPanel.add(field);
            }
        }
    }
}
