FROM andersonlfeitosa/microservice-base
ADD maven/authorizer.jar /opt/microservices/authorizer.jar
ENTRYPOINT ["java", "-Duser.timezone=America/Sao_Paulo", "-Djava.security.egd=file:/dev/./urandom", "-Xmx1024m", "-jar", "authorizer.jar"]
