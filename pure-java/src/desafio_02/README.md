# Desafio 02 - Controle de Fluxo

Desafio proposto para aplicação de conceitos de controle de fluxo em Java.

## Contador (Comparador de Números)
O sistema recebe dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (`for`) e realizar a impressão no console (`System.out.print`) dos números incrementados, exemplo:

- Se você passar os números 12 e 30, logo teremos uma interação (`for`) com 18 ocorrências para imprimir os números, exemplo: "`Imprimindo o número 1`", "`Imprimindo o número 2`" e assim por diante.
- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "`O segundo parâmetro deve ser maior que o primeiro`".

1. Crie o projeto `DesafioControleFluxo`.
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

## Analisar de "Candidatos"
O objetivo deste desafio é desenvolver um sistema para analisar candidatos em um processo seletivo, simulando a avaliação de salários pretendidos, a seleção para entrevistas e a tentativa de contato com os candidatos aprovados.

**Case 1: Análise de Salário**
- O salário base do processo seletivo é R$2000,00.
- O sistema recebe o salário pretendido pelo candidato e faz a análise:
    - Se o salário pretendido for menor ou igual ao salário base, exibir: "LIGAR PARA O CANDIDATO".
    - Caso contrário, exibir: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS".

**Case 2: Seleção para Entrevista**
- O sistema deve selecionar no máximo 5 candidatos que tenham salário pretendido menor ou igual ao salário base.
- Apenas os candidatos que atendem ao critério serão adicionados à lista de candidatos aprovados para entrevista.

**Case 3: Exbindo Lista de Candidatos**
O sistema deve imprimir a lista de candidatos aprovados, indicando quem será contatado pelo setor de RH.

**Case 4: Tentativa de Contato**
- O setor de RH deve tentar ligar para cada candidato até 3 vezes.
- Para simular a resposta do candidato, gere um número aleatório entre `0` e `1`, onde:
    - `1` → O candidato atendeu a ligação.
    - `0` → O candidato não atendeu a ligação.
- O sistema deve exibir:
    - "CONSEGUIMOS CONTATO COM [CANDIDATO] APÓS [TENTATIVA] TENTATIVA(S)." caso o candidato atenda.
    - "NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]." se ele não atender após 3 tentativas.