# Sudoku via Terminal

Este projeto consiste em uma implementação jogável de Sudoku, executada diretamente no terminal, desenvolvida com Java puro, seguindo rigorosamente os princípios de POO e boas práticas de arquitetura de software.

## Proposta

Criar um jogo de Sudoku 9x9, com células fixas e jogáveis, onde o usuário interage via terminal, inserindo valores e completando o tabuleiro conforme as regras do jogo.

A proposta inclui:
- Leitura e exibição do tabuleiro no terminal;
- Células pré-preenchidas fixas (não editáveis);
- Interface de interação via texto;
- Feedback ao jogador em tempo real;
- Validações de jogadas;
- Suporte a entrada de comandos especiais (como ajuda e sair) e,
- Geração dinâmica de novos tabuleiros após a primeira rodada.

## Desafios Técnicos
- Aplicar OOP (encapsulamento, responsabilidade única e modularidade);
- Usar Streams e Collectors para validações de linhas, colunas e blocos;
- Implementar um gerador de tabuleiros Sudoku válidos, com níveis de dificuldade;
- Controlar jogabilidade e fluxo via terminal e,
- Manter o código limpo, comentado e reutilizável para expansão futura (como interface gráfica).

## Arquitetura do projeto
A arquitetura do projeto é baseada em princípios de POO, com classes bem definidas para representar o tabuleiro, células e lógica do jogo. A estrutura modular permite fácil manutenção e expansão.

```
sudoku-terminal/
└── src/
    ├── App.java                    # Ponto de entrada do jogo
    ├── model/
    │   ├── Board.java              # Representa o tabuleiro de Sudoku
    │   └── Cell.java               # Representa uma célula do Sudoku
    ├── service/
    │   └── SudokuGame.java         # Contém a lógica do jogo
    ├── util/
    │   └── BoardLoader.java        # Carrega o tabuleiro a partir de um arquivo
    └── generator/
        └── BoardGenerator.java     # Gera tabuleiros Sudoku válidos
```


## Como jogar
**Pré-requisitos:**
- JDK 17 ou superior,
- Terminal/bash.

**Passos:**
```bash
# 1. Acesse o diretório raiz do projeto
cd sudoku/terminal/src

# 2. Compile todos os arquivos
javac App.java model/*.java service/*.java util/*.java generator/*.java

# 3. Rode o jogo
java App
```

Comandos disponíveis:
- Para jogar: digite linha coluna valor (ex: 4 3 7 → insere o número 7 na linha 4, coluna 3).
- Comandos especiais:
    - `ajuda` → mostra instruções do jogo.
    - `sair` → encerra o jogo atual.