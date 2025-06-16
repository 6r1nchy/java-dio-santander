## dig-bank
Projeto Java de um sistema bancário orientado a objetos, com simulação de contas correntes e poupança, e funcionalidades como depósito, saque e transferência entre contas.

### Objetivo
Este projeto tem como finalidade aplicar os quatro pilares da Programação Orientada a Objetos (POO):
- Abstração
- Encapsulamento
- Herança
- Polimorfismo

### Estrutura do Projeto
- `src/BankApp.java`: classe principal, ponto de entrada da aplicação.
- `src/model/BankAccount.java`: classe abstrata base com atributos e operações comuns.
- `src/model/CheckingAccount.java`: subclasse que representa a conta corrente (com taxa de operação).
- `src/model/SavingsAccount.java`: subclasse que representa a conta poupança (sem taxa).
- `src/service/BankService.java`: serviço com funcionalidades utilitárias como exibição de saldo.

### Conceitos de POO Aplicados
- Abstração: `BankAccount` define comportamento genérico das contas bancárias e serve como base para especializações.
- Encapsulamento: atributos protegidos e acesso controlado por métodos públicos (`getBalance`, `getHolder`).
- Herança: `CheckingAccount` e `SavingsAccount` estendem `BankAccount`, herdando seus comportamentos e sobrescrevendo regras específicas.
- Polimorfismo: a aplicação usa `BankAccount` como tipo de referência para operar sobre objetos de `CheckingAccount` ou `SavingsAccount`, permitindo flexibilidade nas chamadas de métodos.

### Como Executar
1. Clone o projeto e entre na pasta: `git clone <url-do-repo> cd dig-bank`
2. Abra o projeto no Visual Studio Code.
3. Compile e execute `BankApp.java`.

### Exemplo de Uso
```java
BankAccount alice = new CheckingAccount(1, "Alice");
BankAccount bob = new SavingsAccount(2, "Bob");

alice.deposit(1000);
bob.deposit(1500);

alice.transfer(250, bob);
```

Saída esperada: 
```bash
Titular: Alice | Saldo: R$ 749.00
Titular: Bob | Saldo: R$ 1750.00
```