FROM openjdk:8-jdk-alpine

VOLUME /tmp
EXPOSE 8080
ADD lib/hawtio-app-2.2.0.jar  app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --port 80809