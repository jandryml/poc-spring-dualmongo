FROM openjdk:21-jdk-slim

WORKDIR /app
COPY build/libs/dualmongo-0.0.5.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]