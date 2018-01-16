FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
ADD intellicap.jar appintellicap.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/appintellicap.jar"]

