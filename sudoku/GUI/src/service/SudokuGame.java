package service;

import model.Board;
import model.Cell;

// Comente a linha abaixo se quiser usar o gerador de tabuleiros
import util.BoardLoader;

import java.util.Scanner;

// Retire o comentário da linha abaixo se quiser usar o gerador de tabuleiros
// import generator.BoardGenerator;

public class SudokuGame {
    private final Board board;

    public SudokuGame() {
        // Comente a linha abaixo se quiser usar o gerador de tabuleiros
        this.board = BoardLoader.loadBoard();
        // Descomente a linha abaixo se quiser gerar um novo tabuleiro
        // this.board = BoardGenerator.generate("medio");

    }

    public void start() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bem-vindo ao Sudoku!");
            System.out.println("Digite \"ajuda\" para ver instruções ou \"sair\" para encerrar o jogo.\n");

            while (!board.isComplete()) {
                System.out.print("Insira sua jogada (linha coluna valor): ");

                String input = sc.nextLine().trim();

                if (input.equalsIgnoreCase("sair")) {
                    System.out.println("Jogo encerrado. Até a próxima!");
                    return;
                }

                if (input.equalsIgnoreCase("ajuda")) {
                    exibirAjuda();
                    continue;
                }

                String[] partes = input.split("\\s+");
                if (partes.length != 3) {
                    System.out.println("Entrada inválida. Use o formato: linha coluna valor (ex: 3 5 7)\n");
                    continue;
                }

                try {
                    int r = Integer.parseInt(partes[0]) - 1;
                    int c = Integer.parseInt(partes[1]) - 1;
                    int v = Integer.parseInt(partes[2]);

                    if (!estaDentroDoLimite(r, c, v)) {
                        System.out.println("Os valores devem estar entre 1 e 9. Tente novamente.\n");
                        continue;
                    }

                    Cell cell = board.getCell(r, c);
                    if (!cell.isFixed()) {
                        cell.setValue(v);
                    } else {
                        System.out.println("Esta célula é fixa e não pode ser alterada.\n");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Formato inválido. Use apenas números entre 1 e 9 (ex: 4 2 7)\n");
                }
            }

            System.out.println("Parabéns! Você completou o Sudoku!");
        }
    }

    private boolean estaDentroDoLimite(int r, int c, int v) {
        return r >= 0 && r < 9 && c >= 0 && c < 9 && v >= 1 && v <= 9;
    }

    private void exibirAjuda() {
        System.out.println("""
            Instruções do Jogo Sudoku:

            Seu objetivo é preencher a grade com números de 1 a 9
            sem repetir números em uma mesma linha, coluna ou bloco 3x3.

            Use o formato: linha coluna valor
              Exemplo: 3 5 7 → insere o número 7 na linha 3, coluna 5

            Apenas células em branco podem ser preenchidas

            Comandos úteis:
            - "ajuda": exibe estas instruções
            - "sair": encerra o jogo

            Boa sorte!
            """);
    }
}
