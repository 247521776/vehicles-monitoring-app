FROM java:8-jre
WORKDIR /app
EXPOSE 8081
ADD ./target/customer-service.jar /app/
CMD ["java", "-jar", "/app/customer-service.jar"]

