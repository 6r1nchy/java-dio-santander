## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

```mermaid
graph TD
    A[Desenvolvedor (Você)] -->|Código| B[Editor no Host (./api-eventos)]
    B -->|Volume mount| C[Container Docker (API)]
    C --> D[Aplicação Spring Boot]
    D --> E[Camada de Serviço]
    E --> F[Camada de Repositório]
    F --> G[(Banco Railway - PostgreSQL)]

    subgraph Ambientes
        B
        C
    end
```
