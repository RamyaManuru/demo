FROM openjdk:11
ADD target/demo-0.0.1-SNAPSHOT.jar demodocker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar","demodocker.jar"]