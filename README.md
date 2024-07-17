# Projeto API ForumHub

## Descrição
Este projeto consiste em uma API Restful desenvolvida utilizando Spring Boot para o FórumHub.

## Funcionalidades

### Entidades Principais
1. **Usuario**
   - Representa um usuário do sistema.
   - Atributos: `id`, `nome`, `email`, `senha`, `dataCadastro`.
   - Operações: CRUD completo.

2. **Curso**
   - Representa um curso disponível no fórum.
   - Atributos: `id`, `titulo`, `descricao`, `dataPublicacao`.
   - Operações: CRUD completo.

3. **Topico**
   - Representa um tópico de discussão no fórum.
   - Atributos: `id`, `titulo`, `conteudo`, `dataCriacao`, `usuario`, `curso`.
   - Operações: CRUD completo.

### Funcionalidades Implementadas
- **Autenticação e Autorização**
   - Utilização do Spring Security para controle de acesso.
   - Autenticação via JWT (JSON Web Token).

- **Persistência de Dados**
   - Utilização do Spring Data JPA com MySQL para persistência de dados.
   - Configuração de conexão: `spring.datasource.url`, `spring.datasource.username`.

- **Validação de Dados**
   - Utilização do Spring Validation para validação de dados de entrada.

- **Migração de Banco de Dados**
   - Utilização do Flyway para controle e versionamento de migração de banco de dados.
   - Scripts SQL versionados para manter o esquema do banco de dados atualizado.

- **Documentação da API**
   - Utilização do Swagger para documentação automática da API.
   - Documentação acessível via endpoint `/swagger-ui.html`.

### Tecnologias Utilizadas
- Java 17
- Spring Boot 3.3.1
- Spring Web MVC
- Spring Data JPA
- Spring Security
- Flyway
- MySQL
- Lombok (para redução de boilerplate)

## Executando o Projeto

### Pré-requisitos
- JDK 17 instalado
- MySQL instalado e configurado com as credenciais corretas

### Passos para Execução
1. Clone o repositório: `git clone https://github.com/seu-usuario/api-forumhub.git`
2. Importe o projeto em sua IDE como um projeto Maven existente.
3. Configure as credenciais do banco de dados em `application.properties`.
4. Execute a aplicação Spring Boot.
5. Acesse a documentação da API em `http://localhost:8080/swagger-ui.html`.

## Estrutura do Projeto
A estrutura do projeto segue os padrões recomendados pelo Spring Boot, com separação de camadas (controller, service, repository) para melhor organização e manutenção do código.

## Contribuição
Sinta-se à vontade para contribuir com melhorias através de pull requests. Qualquer problema encontrado pode ser reportado através das issues.

Esse documento foi criado com base nas funcionalidades e estrutura do projeto. Para informações adicionais ou detalhes específicos, consulte o código-fonte diretamente.

