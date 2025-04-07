FROM openjdk:21
EXPOSE 9090
ADD D:\STS4Projects\devops-sample\target devops.jar
ENTRYPOINT ["java","-jar", "/devops.jar""]