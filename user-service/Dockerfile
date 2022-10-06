FROM openjdk:8-jdk-alpine
MAINTAINER Mustafa Demir <mustafademirbm@gmail.com>
ADD target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
EXPOSE 3336
ENTRYPOINT ["java", "-jar", "/user-service.jar"]