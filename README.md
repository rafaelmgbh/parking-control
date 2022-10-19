<h1>Parking Control API developed by Rafael Santos</h1>


A CRUD project in order to practice basic knowledge.

In this API, it controls the parking spaces of a condominium.

BACK-END
Devloped using Spring Boot at back-end and some modules:

* Spring MVC;
* Spring Data JPA;
* Spring Validation;

<b>Configure Spring Datasource and JPA</b>

Open src/main/resources/application.properties

<b>For PostgreSQL:</b><br>
spring.datasource.url= jdbc:postgresql://localhost:5432/postgres<br>
spring.datasource.username= postgres<br>
spring.datasource.password= admin<br>
spring.jpa.hibernate.ddl-auto= update<br>

spring.datasource.driver-class-name=org.postgresql.Driver <br>
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

## Run Spring Boot application
ParkingControlApplication


