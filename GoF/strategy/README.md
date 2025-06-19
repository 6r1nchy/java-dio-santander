# Strategy Pattern com Java

Explorando o padrão de projeto Strategy com um exemplo em Java puro.

## O que é o Padrão Strategy?
O padrão Strategy é um padrão de design comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Esse padrão permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Exemplo de Implementação
Vamos imaginar que precisamos criar um sistema que precisa permitir diferentes formas de pagamento: cartão de crédito, boleto, pix, etc. Cada forma de pagamento tem sua regra de processamento e, seria interessante, manter o código flexível, fácil de estender e sem usar `if-else` gigantes. **Este é um cenário perfeito para aplicar o padrão Strategy**.

Então, o objetivo dessa atividade é criar uma interface de pagamento (`PagamentoStrategy`) e implementar diferentes estratégias de pagamento, como:
- `PagamentoCartaoCredito`;
- `PagamentoBoleto`,
- `PagamentoPix`.

Através disso, uma classe `ProcessadorPagamento` poderá utilizar essas estratégias para processar o pagamento de forma flexível.

## Estrutura do Projeto
```
src/
├── App.java
├── PagamentoStrategy.java         
├── PagamentoCartaoCredito.java   
├── PagamentoBoleto.java          
├── PagamentoPix.java             
└── ProcessadorPagamento.java   
```

A arquitetura segue a lógica do padrão Strategy: separar como fazemos um pagamento do objeto que executa esse pagamento.
- `PagamentoStrategy.java` é a interface, a “regra do jogo”, que diz o que uma estratégia de pagamento deve ter: um método pagar(double valor).
- `PagamentoCartaoCredito.java`, `PagamentoPix.java`, `PagamentoBoleto.java` são as estratégias concretas e cada uma implementa `PagamentoStrategy` e define o comportamento do método `pagar()` de forma diferente.
- `ProcessadorPagamento.java` é quem usa a estratégia, ele recebe dinamicamente qual tipo de pagamento será utilizado (por meio do método `setEstrategia`) e executa o pagamento com `processarPagamento`.
- `App.java` é o ponto de entrada, é onde testamos trocando de estratégia em tempo de execução, simulando pagamentos com diferentes formas.