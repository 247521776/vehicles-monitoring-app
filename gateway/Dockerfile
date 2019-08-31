FROM java:8-jre
WORKDIR /app
ADD ./target/gateway.jar /app/
CMD ["java", "-jar", "/app/gateway.jar"]

EXPOSE 8080