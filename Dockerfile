FROM maven:3.8.3-openjdk-17 AS build

COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package -Dmaven.test.skip=true

FROM openjdk:17-alpine

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENV USUARIO_DB admin
ENV SENHA_DB admin
ENV PROFILE dev
ENV NOME_DB walletdatabase

ENTRYPOINT ["java","-jar","/app.jar"]