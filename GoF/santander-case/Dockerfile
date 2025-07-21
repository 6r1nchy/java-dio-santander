# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Cria diretório para o H2 e define permissões
RUN mkdir -p /data && chmod 777 /data

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]