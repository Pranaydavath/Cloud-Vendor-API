# Use an official OpenJDK runtime as a parent image (Using Java 21)
FROM openjdk:21-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven wrapper files
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw # <--- ADD THIS LINE to make mvnw executable

# Download dependencies (this layer is cached if pom.xml doesn't change)
RUN ./mvnw dependency:go-offline -B

# Copy the project source code
COPY src ./src

# Build the application using the Maven wrapper, skipping tests
RUN ./mvnw package -DskipTests

# Expose the port the app runs on (8081)
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "target/rest-demo-0.0.1-SNAPSHOT.jar"]