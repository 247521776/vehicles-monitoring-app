FROM java:8-jre
WORKDIR /app
ADD ./target/customer-service.jar /app/
CMD ["java", "-jar", "/app/customer-service.jar"]

EXPOSE 9010