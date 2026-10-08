# Etapa 1: Build do projeto usando Maven com Java 17
FROM maven:3.8.5-openjdk-17 AS build

COPY src /app/src
COPY pom.xml /app

WORKDIR /app
RUN mvn clean install -DskipTests

FROM eclipse-temurin:17-jre-alpine

COPY --from=build /app/target/task-management-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app
EXPOSE 3000

CMD ["java", "-jar", "app.jar"]