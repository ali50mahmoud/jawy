# Base image with Java and Maven
FROM maven:3.8.4-openjdk-11-slim AS build

# Set the working directory
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the project
RUN mvn clean compile

# Run the tests
RUN mvn test

# Final image
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the built artifacts from the build stage
COPY --from=build /app/target/*.jar ./

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "jawahry.jar"]
