# **Hands on Work VI**

## **Ferramentas Utilizadas para Desenvolvimento**

```
IntelliJ IDEA
DBeaver
Postman
Spring Boot   
Java
MySQL
```

## **Dependências**

O desenvolvimento de código em Java, em geral, usufrui de um significativo conjunto de bibliotecas e _frameworks_. Esta
reutilização é incorporada em um projeto por meio de dependências. Para gerenciar foi utilizado o _Maven_.

```
Spring Web MVC
Spring JPA
MySQL Driver
Lombok
MapStruct
DevTools
Validation
```

## **Métodos**

Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

## **Respostas**

| Status | Descrição                                                          |
|--------|--------------------------------------------------------------------|
| `200`  | Requisição executada com sucesso (success).                        |
| `201`  | Requisição executada com sucesso (success).                        |
| `400`  | Erros de validação ou os campos informados não existem no sistema. |
| `409`  | Conflito.                                                          |
| `405`  | Método não implementado.                                           |

# **Recursos da API**

| Método     | Endpoint                                             |
|------------|---------------------------------------------------|
| `GET`      | /api/aluno                                        |
| `GET`      | /api/aluno/{id}                                   |
| `GET`      | /api/disciplina                                   |
| `GET`      | /api/disciplina/{id}                              |
| `POST`     | /api/aluno                                        |
| `POST`     | /api/disciplina                                   |
| `PUT`      | /api/aluno/{id}                                   |
| `PUT`      | /api/disciplina/{id}                              |
| `DELETE`   | /api/aluno/{id}                                   |
| `DELETE`   | /api/disciplina/{id}                              |

