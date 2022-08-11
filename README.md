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
- [x] Implementação das dependências maven e banco de dados (no caso o PostgreSQL) no pom.xml
- [x] Preparação da Entidade Parking
- [x] Iniciação do container do banco de dados (Docker)
- [x] Download plugin DB Browser (IDE - IntelliJ)
- [X] Configuração do Spring Data JPA e criando a tabela no banco de dados
- [x] Criação da interface *repository*
- [x] Atualização classe **"ParkingService.Java"**
- [x] Implementação dos algoritmos da regra de negócio e realização do cálculo de dias e horas
- [x] Teste de todos os métodos via swagger
- [x] Inclusão de transação
- [x] Configuração do Heroku
- [x] Configuração de segurança - adicionar dependência Spring Security
- [x] Criação da classe de configuração
- [x] Tornando API pública
## Imagem da aplicação
![Parking REST API](https://i.ibb.co/ZMYRv8L/Parking-REST-API.png)

## Links Úteis

- [Verbos HTTP](https://restfulapi.net/http-methods/)

## Agradecimentos
[Professor Sandro Giacomozzi](https://www.linkedin.com/in/sandrogiacomozzi/)