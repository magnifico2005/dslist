
DSList 🎮
DSList é uma aplicação backend desenvolvida em Java com o framework Spring Boot, que tem como objetivo gerenciar uma lista de jogos. O projeto utiliza uma arquitetura baseada em camadas (controller, service e repository) e busca implementar boas práticas de programação, como orientação a objetos e uso de DTOs (Data Transfer Objects) para trafegar dados entre as camadas.

🔧 Tecnologias utilizadas
Java 17+: Linguagem principal do projeto.
Spring Boot: Framework para desenvolvimento rápido de aplicações Java.
JPA / Hibernate: Para mapeamento objeto-relacional e interação com o banco de dados.
H2 Database: Banco de dados em memória utilizado para testes e desenvolvimento.
Jakarta Transactions: Para controle transacional.
Lombok: Para reduzir a boilerplate code.
Maven: Gerenciador de dependências.
🛠️ Funcionalidades
Listar todos os jogos cadastrados no banco de dados.
Buscar detalhes de um jogo específico por seu ID.
Retornar uma versão reduzida dos dados do jogo para otimizar o tráfego de informações.
🗂️ Estrutura do projeto
Entities: Representação das tabelas do banco de dados.
DTOs: Classes para transferência de dados.
Repositories: Camada de acesso ao banco de dados.
Services: Lógica de negócios e interação entre repositórios e controladores.
Controllers: Endpoints para a interação com o cliente.
🚀 Como executar
Clone o repositório:
bash
Copiar código
git clone https://github.com/magnifico2005/dslist.git
cd dslist
Configure o ambiente:
Certifique-se de ter o Java 17+ e Maven instalados.
Execute a aplicação:
bash
Copiar código
./mvnw spring-boot:run
Acesse a API no navegador ou via ferramentas como Postman:
arduino
Copiar código
http://localhost:8080
📚 Aprendizados e boas práticas
Este projeto é uma implementação prática do uso de Spring Boot, servindo como um aprendizado de conceitos como:

Criação e utilização de DTOs.
Transações somente leitura com @Transactional(readOnly = true).
Uso de repositórios JPA para persistência de dados.
