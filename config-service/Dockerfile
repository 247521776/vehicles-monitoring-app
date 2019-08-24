FROM java:8-jre
ADD ./target/config.jar /app/
CMD ["java", "-jar", "/app/config-service.jar"]
EXPOSE 8081
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8081/actuator/health || exit 1

