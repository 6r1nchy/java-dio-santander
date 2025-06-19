# Facade Design Pattern com Java

Mostrando como implementar o padrão de projeto Facade com Java puro. É um excelente recurso para deixar o código mais limpo, escondendo a complexidade de vários sistemas internos atrás de uma interface simples.

## O que é o padrão Facade?
O padrão Facade é um padrão estrutural que fornece uma interface unificada e simplificada para um conjunto de interfaces em um subsistema. Ele ajuda a esconder a complexidade interna do sistema, tornando-o mais fácil de usar e entender. Com isso, o código cliente pode interagir com uma única "fachada" sem precisar conhecer os detalhes das várias classes envolvidas por trás dos bastidores.

## Exemplo de implementação
Vamos imaginar como cenário um sistema de empréstimos bancários. Quando um cliente deseja solicitar um empréstimo, ele pode interagir com várias partes do sistema, como validação de crédito, análise de risco e aprovação de empréstimo. Em vez de expor todas essas complexidades ao cliente, podemos criar uma fachada que simplifica essa interação.

Neste exemplo, vamos implementar o seguinte cenário:
1. Conferir o sando bancário do cliente;
2. Verificar o histórico de crédito do cliente e,
3. Validar a documentação necessária para o empréstimo.

Tudo isso acontece internamente, mas o usuário ou a classe principal, só precisa interagir com essa fachada para solicitar o empréstimo.

## Estrutura do projeto
```
src/
├── App.java
├── EmprestimoFacade.java
├── VerificadorSaldo.java
├── VerificadorCredito.java
└── ValidadorDocumentos.java
```

Resumo do que ocorre:
- As classes complexas (VerificadorSaldo, VerificadorCredito, ValidadorDocumentos) são os sistemas internos com suas lógicas.
- O EmprestimoFacade centraliza todas essas operações, expondo apenas o método verificarElegibilidade(String cliente).
- O usuário final (App) não precisa saber nada sobre como o processo acontece por dentro.