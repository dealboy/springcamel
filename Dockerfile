FROM openjdk:8-jdk-alpine

VOLUME /tmp
EXPOSE 8080 8081
ADD target/spring-apache-camel-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar