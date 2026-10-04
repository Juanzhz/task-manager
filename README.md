# Task Manager API

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

## Tecnologias

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Jakarta Validation

## Funcionalidades

* Criar tarefas
* Listar tarefas
* Buscar tarefa por ID
* Atualizar tarefas
* Excluir tarefas
* Validação de dados
* Tratamento de erros
* Registro automático de data de criação e atualização

## Endpoints

| Método | Endpoint      | Descrição            |
| ------ | ------------- | -------------------- |
| POST   | `/tasks`      | Criar tarefa         |
| GET    | `/tasks`      | Listar tarefas       |
| GET    | `/tasks/{id}` | Buscar tarefa por ID |
| PUT    | `/tasks/{id}` | Atualizar tarefa     |
| DELETE | `/tasks/{id}` | Excluir tarefa       |

## Exemplo de criação

```json
{
  "title": "Estudar Java",
  "description": "Estudar Spring Boot",
  "completed": false
}
```

## Estrutura do projeto

```text
src/main/java/com/juanrossi/taskmanager
├── controller
├── entity
├── exception
├── repository
└── service
```

## Banco de dados

O projeto utiliza PostgreSQL para persistência dos dados.

Configurações esperadas:

* Host: `localhost`
* Port: `5432`
* Database: `task_manager`

## Como executar

1. Instale o Java 21.
2. Instale o PostgreSQL.
3. Crie o banco de dados `task_manager`.
4. Configure as credenciais do banco no `application.properties`.
5. Execute a aplicação pelo IntelliJ ou através do Maven.

A API estará disponível em:

`http://localhost:8080`

## Status do projeto

Projeto desenvolvido como parte do meu portfólio para prática de desenvolvimento backend com Java e Spring Boot.
