FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY build/libs/JobTickets-Backend-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]