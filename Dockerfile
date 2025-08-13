FROM openjdk:17
EXPOSE 8080
ADD target/ecommerce-services.jar ecommerce-services.jar
ENTRYPOINT ["java", "-jar","/ecommerce-services.jar"]