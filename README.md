# springcamel

#Build java app
mvn package
#Build the dockerfile with tag latest
docker build --rm -f "Dockerfile" -t springcamel:latest .


#Run standalone with external activemq
java -DBROKER_URL=tcp://activemq:61616 -jar target/spring-apache-camel-1.0-SNAPSHOT.jar

#Run Standalone with a temp activemq
java -DBROKER_URL=vm://localhost?broker.persistent=false -jar target/spring-apache-camel-1.0-SNAPSHOT.jar

URLS:
Hawtio:
http://localhost:8081/actuator/hawtio/

ActiveMQ:
http://localhost:8161/



#Run via docker Compose
docker-compose -f "docker-compose.yml" up -d --build