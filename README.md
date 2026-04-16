# Spring Boot Project - Management API

Este é um projeto de uma API RESTful construída com **Spring Boot** e **Java 25**, desenvolvida como parte de um estudo aprofundado sobre o ecossistema Spring, JPA/Hibernate e boas práticas de desenvolvimento de software.

A aplicação simula um sistema de gerenciamento de pedidos, produtos, categorias e usuários, implementando um modelo de domínio robusto com associações complexas.

## 🚀 Tecnologias Utilizadas

| Tecnologia | Descrição |
| :--- | :--- |
| **Java 25** | Linguagem de programação principal |
| **Spring Boot 4.0.5** | Framework para desenvolvimento da aplicação |
| **Spring Data JPA** | Abstração para persistência de dados e ORM |
| **Hibernate** | Implementação do JPA |
| **H2 Database** | Banco de dados em memória para testes e desenvolvimento rápido |
| **PostgreSQL** | Banco de dados relacional para ambiente de desenvolvimento/produção |
| **Maven** | Gerenciador de dependências e automação de build |

## 📦 Modelo de Domínio

O projeto implementa as seguintes entidades e relacionamentos:

- **User**: Gerenciamento de usuários (clientes).
- **Order**: Pedidos realizados pelos usuários, contendo status (WAITING_PAYMENT, PAID, SHIPPED, DELIVERED, CANCELED).
- **Product**: Catálogo de produtos disponíveis.
- **Category**: Categorias para classificação de produtos (Muitos-para-Muitos com Product).
- **OrderItem**: Entidade de ligação entre Pedidos e Produtos, contendo quantidade e preço no momento da compra.
- **Payment**: Informações de pagamento associadas a um pedido.

## 🛠️ Funcionalidades da API

A API disponibiliza os seguintes recursos (Endpoints):

### Usuários (`/users`)
- `GET /users` - Lista todos os usuários.
- `GET /users/{id}` - Busca um usuário por ID.
- `POST /users` - Cria um novo usuário.
- `DELETE /users/{id}` - Remove um usuário.
- `PUT /users/{id}` - Atualiza dados de um usuário.

### Produtos (`/products`)
- `GET /products` - Lista todos os produtos.
- `GET /products/{id}` - Busca um produto por ID.

### Categorias (`/categories`)
- `GET /categories` - Lista todas as categorias.
- `GET /categories/{id}` - Busca uma categoria por ID.

### Pedidos (`/orders`)
- `GET /orders` - Lista todos os pedidos.
- `GET /orders/{id}` - Busca um pedido por ID.

## ⚙️ Configuração e Execução

### Pré-requisitos
- JDK 25 ou superior.
- Maven 3.x instalado.

### Perfis de Projeto
O projeto utiliza perfis do Spring para diferentes ambientes:

1.  **Test (`test`)**: Utiliza banco de dados **H2** em memória. Ideal para testes rápidos e demonstração.
    - O console do H2 fica disponível em: `http://localhost:8080/h2-console`
2.  **Dev (`dev`)**: Configurado para utilizar **PostgreSQL**.
    - Requer um banco de dados chamado `springboot_course` rodando localmente.

### Como executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/Konkvon/spring-boot-project.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd spring-boot-project
   ```
3. Execute a aplicação usando o Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

## 🧪 Seeding de Dados
Ao executar o projeto com o perfil `test` ativo, a classe `TestConfig` irá popular automaticamente o banco de dados com dados iniciais (usuários, produtos, categorias e pedidos) para facilitar a visualização e teste das funcionalidades.

## 📂 Estrutura de Pacotes
O projeto segue uma organização em camadas:
- `entities`: Classes de domínio mapeadas para o banco de dados.
- `repositories`: Interfaces para acesso aos dados (Spring Data JPA).
- `services`: Camada de lógica de negócio.
- `resources`: Controladores REST (Camada de API).
- `config`: Configurações específicas da aplicação e perfis.
- `resources/exceptions e services/exceptions`: Tratamento customizado de erros e exceções da API.

---
Desenvolvido por [Konkvon](https://github.com/Konkvon).
