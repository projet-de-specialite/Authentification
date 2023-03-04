- MySQL
```
spring.datasource.url= jdbc:mysql://localhost:3306/aprojet_specialite?useSSL=false
spring.datasource.username= root
spring.datasource.password= 

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
bezkoder.app.jwtSecret= bezKoderSecretKey
bezkoder.app.jwtExpirationMs= 86400000
```
## Run Spring Boot application
```
mvn spring-boot:run
```
