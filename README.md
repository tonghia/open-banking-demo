# Better Banking

### To run: 

1. Start MySQL
    
    `docker run -d --env="MYSQL_ROOT_PASSWORD=123456" --env="MYSQL_ROOT_HOST=%" --env="MYSQL_DATABASE=bbdb" -p 3306:3306 --name=mysql mysql/mysql-server:latest`
    
2. Start the Spring Boot application
    
    `./gradlew bootRun`

### To generate new model: 
`./gradlew clean openApiGenerate copyGenerated build`
