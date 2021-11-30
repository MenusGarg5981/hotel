FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY agent /opt/agent
COPY ${JAR_FILE} hotel-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-javaagent:/opt/agent/skywalking-agent.jar","-jar","./hotel-0.0.1-SNAPSHOT.jar"]
