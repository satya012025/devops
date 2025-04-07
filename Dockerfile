FROM openjdk:21
EXPOSE 9090
ADD target/devops.jar devops.jar
ENTRYPOINT ["java","-jar", "/devops.jar"]