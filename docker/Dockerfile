FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY backend/target/grouped-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]