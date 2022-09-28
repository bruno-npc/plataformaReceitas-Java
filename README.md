# plataformaReceitas-Java
Site para cadastro de receitas, que recebe json com informações de titulo, descrição, data de criação e exclusão das receitas.

Os dados estão sendo armazenados na memoria, cada nova inicialização zera os dados 
(Facil implementação de algum banco, modificando o "aplication.properties")

@Getter e @Setter //Cria get e set em tempo de compilação - extensão lombok


# Dependencias usadas:
- H2 Database
- Spring Data JPA
- Lombok
- Spring Web
- Spring Boot DevTools


Testes através do Postman - POST e GET no URL /api/receitas   
Para get, é necessarios ter a referencia do id cadastrado, Ex: /api/receitas/1
