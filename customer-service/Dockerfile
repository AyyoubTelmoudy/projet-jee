FROM openjdk:11
EXPOSE 8081
ADD target/customer-service.jar customer-service.jar
ENTRYPOINT ["java","-jar","/customer-service.jar"]