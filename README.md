# Better Banking

### To run: 

1. Start MySQL
    
    `docker run -d --env="MYSQL_ROOT_PASSWORD=123456" --env="MYSQL_ROOT_HOST=%" --env="MYSQL_DATABASE=bbdb" -p 3306:3306 --name=mysql mysql/mysql-server:latest`
    
2. Start the Spring Boot application
    
    `./gradlew bootRun -Dorg.gradle.java.home=<JDK-11>`

    
   For example: ./gradlew bootRun -Dorg.gradle.java.home=/Users/nbcrocker/Library/Java/JavaVirtualMachines/adopt-openj9-11.0.10/Contents/Home
    
3. String Keycloak: 
    
    `docker run -d -p 9001:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=123456 --name=keycloak quay.io/keycloak/keycloak:12.0.2`    

### To generate new model: 
`./gradlew clean openApiGenerate copyGenerated build`
