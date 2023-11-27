# Java Persistence API (JPA)
## Visão Geral
A Java Persistence API (JPA) é uma especificação do Java EE (Enterprise Edition) que fornece uma abordagem padrão para mapeamento objeto-relacional em aplicações Java. Ela simplifica o desenvolvimento de aplicações que interagem com bancos de dados relacionais, permitindo que os desenvolvedores usem objetos Java para representar dados persistentes, em vez de lidar diretamente com consultas SQL.

## Funcionalidades Principais
  - Mapeamento Objeto-Relacional (ORM): JPA simplifica a interação com bancos de dados relacionais, permitindo que objetos Java sejam automaticamente mapeados para tabelas de banco de dados e vice-versa.
  - Entidades: No contexto do JPA, entidades são objetos Java que representam dados persistentes. Elas são mapeadas para tabelas no banco de dados e podem ser gerenciadas pelo contexto de persistência.
  - Contexto de Persistência: O contexto de persistência é responsável por rastrear as entidades gerenciadas, controlar as alterações e sincronizá-las com o banco de dados.
  - Consultas JPQL: A Linguagem de Consulta de Objeto Java (JPQL) permite que os desenvolvedores realizem consultas orientadas a objetos em vez de consultas SQL, facilitando a interação com as entidades.
  - Relacionamentos: JPA oferece suporte a diferentes tipos de relacionamentos entre entidades, como um-para-um, um-para-muitos e muitos-para-muitos.
 - Transações: O JPA gerencia transações automaticamente, garantindo consistência e atomicidade nas operações de banco de dados.

## Como Usar
- Adicionar Dependência: Inclua a dependência do JPA em seu projeto, utilizando ferramentas como Maven ou Gradle.
- Configurar o arquivo persistence.xml: Configure as propriedades de persistência, como o provedor JPA e as unidades de persistência, no arquivo persistence.xml.
- Gerenciar Entidades: Crie classes de entidade Java, anotadas com @Entity, e utilize as anotações do JPA para configurar o mapeamento.
- Operações de Persistência: Utilize o EntityManager para realizar operações de persistência, como salvar, atualizar, recuperar e excluir entidades.

## Projeto (fonte: amigoscode)
![image](https://github.com/carvmi/jpa-spring-boot/assets/105459743/557a087d-ead6-4e10-a176-46157363dc15)
![image](https://github.com/carvmi/jpa-spring-boot/assets/105459743/11e42a2e-c28b-40e3-bb94-3dbcb095dc3a)
![image](https://github.com/carvmi/jpa-spring-boot/assets/105459743/96d7d9ba-a89c-49be-9705-3d48d2127d9d)

## Recursos Adicionais
- [Documentação Oficial do JPA](https://docs.oracle.com/javaee/7/tutorial/persistence-intro.htm)
- [Java EE Tutorial - Introdução ao JPA](https://javaee.github.io/tutorial/persistence-intro004.html)

