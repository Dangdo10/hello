# Importing JDK and copying required files
FROM openjdk:17-jdk AS build
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]