# Spring Boot API + PostgreSQL em Containers

Ambiente de desenvolvimento para criar, testar e rodar APIs Java com Spring Boot e PostgreSQL utilizando Docker.

## Motivação
Este ambiente de desenvolvimento foi criado com o objetivo de fornecer uma base robusta, portátil e limpa para criação de APIs Java com Spring Boot. Ao utilizar containers com Docker e Docker Compose, evitamos a necessidade de instalar Java, Maven ou banco de dados diretamente na máquina do desenvolvedor, promovendo isolamento de ambiente, consistência entre times e redução de erros relacionados à configuração local.

Porque usar este ambiente?
- Ambiente 100% replicável: o mesmo setup roda em qualquer máquina com Docker, independente do sistema operacional;
- Sem poluir o host: nenhuma dependência Java, Maven ou PostgreSQL precisa ser instalada localmente;
- Facilidade de onboard: novos devs conseguem rodar o projeto com poucos comandos;
- Produtividade desde o primeiro minuto: API conectada ao banco em segundos, pronta pra criar, testar e iterar,
- Integração contínua facilitada: a estrutura containerizada está alinhada com pipelines de CI/CD modernos.

Aos iniciantes, este projeto é uma excelente oportunidade para aprender sobre desenvolvimento de APIs com Spring Boot e PostgreSQL, além de entender como containers podem facilitar o dia a dia do desenvolvedor. Esta forma de trabalhar é amplamente adotada por empresas e equipes de desenvolvimento, tornando-se uma habilidade valiosa no mercado. Fica a dica!

## Pre-requisitos
- Docker e Docker Compose instalados;
- Terminal Bash ou PowerShell (Windows);
- Editor de código (VS Code, IntelliJ etc.).

## Estrutura do Projeto

```
spring/
├── docker-compose.yml
├── src/
│   └── main/
│       ├── java/
│       │   └── com.user.api/
│       │       ├── ApiApplication.java
│       │       ├── model/Produto.java
│       │       ├── controller/ProdutoController.java
│       │       └── repository/ProdutoRepository.java
│       └── resources/application.properties
├── pom.xml
└── ...
├── Dockerfile
```

## Como Executar
1. Suba o container com o comando:
   ```bash
   docker-compose up -d
   ```
2. Acesse o container da aplicação:
   ```bash
   docker exec -it dev-app bash
   ```
3. Rode a aplicação Spring Boot:
   ```bash
   cd /app
    ./mvnw clean package -DskipTests
    java -jar target/*.jar
   ```
A aplicação estará rodando em `http://localhost:8080` ou na porta que você configurou no docker-compose.yml.
4. Para parar os containers, execute:
   ```bash
   docker-compose down
   ```

## Testando a API
Esta api foi criada para simular um CRUD de produtos, mas nada impede de você adaptá-la para suas necessidades. Você pode testar os endpoints utilizando ferramentas como Postman ou cURL.

### `GET /produtos`
```bash
curl -X GET http://localhost:8080/produtos
```

### `POST /produtos`
```bash
    curl -X POST http://localhost:8080/produtos -H "Content-Type: application/json" -d '{
    "nome": "Produto Exemplo",
    "preco": 99.99
    }'
```

**Dica:** no powershell, você pode usar `Invoke-RestMethod` para fazer requisições HTTP.

### PostgreSQL
A base de dados PostgreSQL está configurada para rodar em um container separado. Você pode acessar o banco de dados utilizando ferramentas como DBeaver, pgAdmin ou diretamente via terminal.
- Host (dentro do container app): postgres
- Porta: 5432
- Database: produtosdb
- Usuário: admin
- Senha: senha123

**Lembrando** que você SEMPRE pode alterar as configurações de conexão no arquivo `application.properties` da aplicação Spring Boot e/ou definir credenciais diferentes no `docker-compose.yml`.