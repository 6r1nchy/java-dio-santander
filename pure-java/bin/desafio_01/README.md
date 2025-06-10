# Desafio 01 - Conta Banco

Objetivo: exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto ``ContaBanco`` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
   - Número da conta
   - Nome do titular
   - Saldo
2. Dentro do projeto, crie a classe ``ContaTerminal.java`` para realizar toda a codificação do nosso programa.

**Regras para a criação de variáveis**

| Atributo | Tipo de Dado | Exemplo                |
|------------------|--------------|--------------------------|
| numeroConta      | int          | 1021 |
| agencia          | String       | 067-8          |
| nomeTitular      | String       | Maria da Silva  |
| saldo            | double       | 1000.00         |

**Terminal, main args e a classe Scanner**

Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
- Programa: "Por favor, digite o número da Agência!"
- Usuário: 1021 (depois ENTER para o próximo campo)

**Concatenação e classe String com método concat**

Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
```bash
"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
```
*Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.