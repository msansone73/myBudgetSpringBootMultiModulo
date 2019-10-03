FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY /root/git/myBudgetSpringBootMultiModulo/rest/target/rest-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]