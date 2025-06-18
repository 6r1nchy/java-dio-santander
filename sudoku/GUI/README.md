# Sudoku com GUI em Java

Este projeto é uma versão expandida e interativa do Sudoku via terminal, agora com interface gráfica desenvolvida com Swing, mantendo a lógica de jogo totalmente em Java puro e orientado a objetos.

O visual é simples mas eficaz: uma janela com o tabuleiro 9x9, campos jogáveis, feedback em tempo real, e botões de interação. Toda a lógica é herdada da versão terminal, agora com usabilidade visual.

## Proposta

Criar um jogo completo de Sudoku com interface gráfica usando Swing, a partir de uma base orientada a objetos em Java puro. O jogador interage com campos editáveis e recebe feedback visual com botões de validação e solução.

A proposta inclui:
- Interface amigável com JFrame, JPanel e JTextField
- Tabuleiro gerado dinamicamente com níveis de dificuldade
- Células fixas são bloqueadas visualmente (cinzas)
- Validação visual via botão “Verificar”
- Botão “Mostrar Solução” para testes e fim de jogo
- Feedback via pop-ups (JOptionPane)
- Arquitetura desacoplada para fácil manutenção e expansão

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
    ├── gui/
    │   ├── SudokuPanel.java        # Painel com a grade do tabuleiro e botões
    │   ├── SudokuFrame.java        # Janela principal do jogo
    │   └── SudokuController.java   # Controlador que lida com eventos e validações
    └── generator/
        └── BoardGenerator.java     # Gera tabuleiros Sudoku válidos
    
```

## Como jogar
**Pré-requisitos:**
- JDK 17 ou superior,
- IDE ou terminal com suporte a projetos Java.

**Passos:**
```bash
# 1. Acesse o diretório raiz do projeto
cd sudoku/GUI/src

# 2. Compile todos os arquivos
javac App.java model/*.java service/*.java util/*.java generator/*.java

# 3. Rode o jogo
java App
```

Controles disponíveis:
- Digite valores de 1 a 9 nas células jogáveis (brancas)
- Células fixas (cinzas) não podem ser alteradas
- Pressione:
    - `Verificar` → valida se o Sudoku está corretamente resolvido
    - `Mostrar Solução` → preenche automaticamente a solução completa (encerra o jogo atual)

## O que vem a seguir
Se conseguir voltar a este projeto, considero adicionar:
- Botão de "Novo Jogo";
- Menu de seleção de dificuldade (fácil, médio, difícil);
- Destaque visual de erros em tempo real;
- Timer e contador de jogadas e,
- Exportação para .jar ou versão instalável.