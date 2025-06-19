# Singleton com Java

Entenda o padrão de projeto Singleton, que garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.

## O que é Singleton?
O padrão Singleton é um padrão de projeto criacional que garante que uma classe tenha apenas uma instância durante todo o ciclo de vida da aplicação e forneça um ponto de acesso global a ela. Ele é comumente utilizado para gerenciar recursos compartilhados, como configurações, conexões com banco de dados ou serviços de logging, evitando múltiplas instâncias que poderiam causar inconsistências ou uso ineficiente de recursos.

## Implementação do Singleton

Vamos imaginar que estamos desenvolvendo uma aplicação que precisa carregar as configurações do sistema apenas uma vez durante toda a execução, como por exemplo, as configurações do banco de dados, modo de debug, etc. Essas configurações devem ser acessadas de qualquer parte do sistema, mas a classe só pode ter uma única instância. Para isso, podemos implementar o padrão Singleton.

**Requisitos da classe:**
- Atributos privados como `modoDebug` (booleano) e `caminhoBanco` (String);
- Um construtor privado, para que nenhuma outra classe consiga instanciar diretamente;
- Um método `getInstance()` público e estático, que retorna a única instância da classe e,
- Métodos públicos `get` e `set` para os atributos.

## Como funciona?
A arquitetura do Singleton é simples e se encontra dentro de `src`:
```
src/
├── App.java
│
├── TesteSingleton.java  
│
└── ConfiguracaoSistema.java
    
```

Cada arquivo tem uma função específica:
- `App.java`: classe principal que inicia a aplicação e demonstra o uso do Singleton.
    - ele guarda duas informações: o modo de debug e o caminho do banco de dados, que são acessados através da instância única da classe `ConfiguracaoSistema`.
- `TesteSingleton.java`: classe de teste que verifica se o Singleton está funcionando corretamente.
    - ele cria duas referências para a instância do Singleton e modifica suas configurações, garantindo que ambas as referências apontem para a mesma instância.
- `ConfiguracaoSistema.java`: implementa o padrão Singleton, com um construtor privado, atributos `modoDebug` e `caminhoBanco`, e o método `getInstance()`.