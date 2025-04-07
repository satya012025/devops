FROM openjdk:21
EXPOSE 9090
ADD target\D:\STS4Projects\devops-sample devops.jar
ENTRYPOINT ["java","-jar", "/devops.jar""]