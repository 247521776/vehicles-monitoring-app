FROM java:8-jre
WORKDIR /app
ADD ./target/discovery-service.jar /app/
CMD ["java", "-jar", "/app/discovery-service.jar"]

EXPOSE 8761