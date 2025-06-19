# ViaCEP API com Spring Boot

Este projeto é uma implementação da API ViaCEP utilizando Spring Boot. A API permite consultar endereços a partir de um CEP e vice-versa.

## Motivação
Atividade proposta no bootcamp de Java da DIO, com o objetivo de praticar conceitos de Spring Boot, RESTful APIs e integração com serviços externos.

O projeto trata-se de uma API RESTful construída com Spring Boot 3.5.0 que permite:
- Buscar endereço a partir do CEP, consultando o serviço oficial do ViaCEP;
- Descobrir o CEP a partir do nome da rua, UF e cidade;
- Documentação interativa via Swagger UI e,
- Interface HTML integrada, consumindo os endpoints com JavaScript.

A API retorna os dados em formato JSON via endpoints REST, com tratamento global de exceções, validação de entrada e resposta em DTOs.

## Estrutura do Projeto

- `src/main/java`: Contém o código fonte da aplicação.
- `src/main/resources`: Contém os arquivos de configuração e recursos estáticos.
- `src/test/java`: Contém os testes automatizados.

## Como Executar

1. Certifique-se de ter o Docker e o Docker Compose instalados;
2. Navegue até o diretório do projeto;
3. Execute os comandos:

```bash
# Suba o container através do Docker Compose
docker-compose up

# Entre no bash do container
docker exec -it viacep-app bash

# Se a aplicação não tiver maven, execute:
apt update && apt install -y maven

# Execute a aplicação
mvn install && mvn spring-boot:run
```

4. A API estará disponível em:
    - Swagger UI: `http://localhost:8080/swagger-ui.html`,
    - Interface Web: `http://localhost:8080/index.html`.

## Endpoints

### Buscar Endereço por CEP

- **URL**: `/api/enderecos/{cep}`
- **Método**: `GET`
- **Descrição**: Retorna os dados do endereço correspondente ao CEP informado.

### Descobrir CEP por Endereço

- **URL**: `/api/enderecos/buscar`
- **Método**: `POST`
- **Descrição**: Recebe os dados de um endereço e retorna o CEP correspondente.