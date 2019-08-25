FROM java:8-jre
WORKDIR /app
ADD ./target/config-service.jar /app/
CMD ["java", "-jar", "/app/config-service.jar"]
EXPOSE 8081
