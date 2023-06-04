# Use uma imagem base do OpenJDK 17
FROM openjdk:17-jdk-slim-buster

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo JAR da aplicação para o contêiner
COPY target/carteira-0.0.1-SNAPSHOT.jar /app

# Exponha a porta em que a aplicação está sendo executada
EXPOSE 8080

# Defina o comando padrão a ser executado quando o contêiner for iniciado
CMD ["java", "-jar", "carteira-0.0.1-SNAPSHOT.jar"]
