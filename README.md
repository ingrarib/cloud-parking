# DESAFIO DE PROJETO 3 - Realizando Deploy na Nuvem de um conjunto de API’s desenvolvida em Spring Boot
### Objetivo
Construir uma API para controle de um estacionamento de veículos. Está API deverá controlar entrada e saída de veículos.  
Os dados deverão ser cadastrados em um banco de dados relacional.  
Esta API será exposta na nuvem, porém com controle de acesso.

#### Passo a passo do que foi feito:
- [x] Criação do projeto utilizando o [Spring Initializr](https://start.spring.io/), com a dependência Spring Web
- [x] Criação do repositório no GitHub
- [x] Criação da aplicação no [Heroku](https://www.heroku.com/), conectar ao GitHub e habilitar **deploy automático**
- [x] Configuração da versão do Java (caso necessário)
- [x] Criação de Endpoints de cadastro (*Model* e *Service*)
- [x] Implementação dos códigos de retorno HTTP de acordo com a operação
- [x] Implementação e configuração do Swagger-UI para disponibilizar para o front-end
- [x] Tratamento de exceções - deixar claro para o consumidor o motivo de um erro
- [x] Implementação de Testes automatizados de API
- [] Implementação das dependências maven e banco de dados (no caso o PostgreSQL) no pom.xml
- [] Preparação da Entidade Parking
- [] Iniciação do container do banco de dados
- [] Configuração do Spring Data JPA
- [] Criação da interface *repository*
## Imagens da aplicação
![texto](imagem)

## Links Úteis

- [Verbos HTTP](https://restfulapi.net/http-methods/)

## Agradecimentos
[Professor Sandro Giacomozzi](https://www.linkedin.com/in/sandrogiacomozzi/)