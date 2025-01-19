# cardapio-api
Criação de API para gerenciamento de cardápio usando Java, Spring, Maven, JPA, Lombok e PostgreSQL.

## Descrição
Esta API permite a criação, leitura, atualização e exclusão (CRUD) de itens de um cardápio, armazenados em um banco de dados PostgreSQL.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação
- **Spring Boot**: Framework para construção de aplicações Java
- **Maven**: Gerenciador de dependências e build
- **JPA (Java Persistence API)**: Mapeamento objeto-relacional
- **Lombok**: Biblioteca para reduzir boilerplate code
- **PostgreSQL**: Sistema gerenciador de banco de dados relacional

## Como Executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/BrenoHen/cardapio-api.git
   cd cardapio-api
   
2. Compile e rode o projeto:
   ```bash
   mvn spring-boot:run
   
3. A API estará disponível em <br> http://localhost:8080

# Endpoints
- **Inclusão no Banco**<br>
POST: **/food**

Corpo da Requisição:
```bash
{
  "title": "Nome do Prato",
  "image": "URL da Imagem",
  "price": 12.99
}
```

### Método GET All
- Retorna todos os itens do cardápio<br>
GET: **/food**

### Método GET By ID
- Retorna um item específico pelo seu ID.
GET: **/food/{id}**

### Atualização de Item
- Atualiza um item no banco de dados.
PUT: **/food**

Corpo da Requisição:
```bash
{
  "id": 1,
  "title": "Nome Atualizado do Prato",
  "image": "URL Atualizada da Imagem",
  "price": 15.99
}
```

### Exclusão de Item
- Deleta um item do banco de dados.
DELETE: **/food**

Corpo da Requisição:
```bash 
{
  "id": 1,
  "title": "Nome do Prato",
  "image": "URL da Imagem",
  "price": 12.99
}
```

### Contribuição
Sinta-se à vontade para contribuir com o projeto. Para isso, faça um fork do repositório, crie uma branch para suas alterações e submeta um pull request.
