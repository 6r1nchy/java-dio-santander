FROM openjdk:17-jdk-slim

RUN apt-get update && \
    apt-get install -y maven && \
    apt-get clean

WORKDIR /app

COPY mvnw* ./
COPY .mvn/ .mvn/

COPY . .

RUN mvn dependency:go-offline

CMD ["mvn", "spring-boot:run"]
