# Stage 1: Build
FROM maven:3.9-openjdk-17 as build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Stage 2: Runtime
FROM openjdk:17-jdk-slim as stage-1
WORKDIR /app
COPY --from=build /app/target/dslist-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
