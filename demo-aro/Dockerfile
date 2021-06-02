FROM openjdk:8-jdk-alpine
LABEL maintainer="@AshWilliams" 
COPY target/demo-0.0.1-SNAPSHOT.jar message-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/message-api.jar"]