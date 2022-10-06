FROM openjdk:8-jdk-alpine
MAINTAINER Mustafa Demir <mustafademirbm@gmail.com>
ADD target/book-service-0.0.1-SNAPSHOT.jar book-service.jar
EXPOSE 3335
ENTRYPOINT ["java", "-jar", "/book-service.jar"]