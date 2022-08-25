FROM openjdk:17-alpine
EXPOSE 8080
ADD target/springbootk8s-0.0.1-SNAPSHOT.jar springbootk8s.jar
ENTRYPOINT ["java","-jar","/springbootk8s.jar"]